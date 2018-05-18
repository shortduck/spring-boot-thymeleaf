package me.ankit.zooplus.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import me.ankit.zooplus.Iconstants;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		
		http		
		.authorizeRequests()
		.antMatchers( Iconstants.ROOT_PATH + Iconstants.PAGES.CONVERT.toString().toLowerCase() 
				, Iconstants.ROOT_PATH + Iconstants.PAGES.USERS.toString().toLowerCase()).authenticated()		
		.anyRequest().permitAll()
		.and()
		.formLogin().loginPage(Iconstants.ROOT_PATH + Iconstants.PAGES.LOGIN.toString().toLowerCase())
		.loginProcessingUrl(Iconstants.ROOT_PATH + Iconstants.PAGES.LOGIN.toString().toLowerCase());		
		;

	

		;

	}

}
