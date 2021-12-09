package com.appdeveloperblog.app.resourceServer.security;

import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationConverter;

@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		JwtAuthenticationConverter jwtAuthenticationConverter = new JwtAuthenticationConverter();
		jwtAuthenticationConverter.setJwtGrantedAuthoritiesConverter(new KeyClockRoleConvertor());
		//KeyClockRoleConvertor
		http.authorizeRequests((requests) -> {
			try {
				requests.antMatchers(HttpMethod.GET,"/users/status/check").hasRole("developer").anyRequest().authenticated().and().oauth2ResourceServer().jwt().jwtAuthenticationConverter(jwtAuthenticationConverter);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}
	
}
