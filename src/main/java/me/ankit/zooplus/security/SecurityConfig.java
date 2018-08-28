package me.ankit.zooplus.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.util.AntPathMatcher;
import org.thymeleaf.extras.springsecurity4.dialect.SpringSecurityDialect;

import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;

import me.ankit.zooplus.ILogging;
import me.ankit.zooplus.Iconstants;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter implements ILogging {

	//@Autowired
	//DataSource dataSource;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		Log.info("SecurityConfig : configure");		

		http.authorizeRequests()
				.antMatchers(Iconstants.ROOT_PATH + Iconstants.PAGES.CONVERT.toString().toLowerCase() ,
				Iconstants.ROOT_PATH + Iconstants.PAGES.USERS.toString().toLowerCase() ,
				"/user/{userID}"
						)						
				.authenticated()				
				.anyRequest()
				.permitAll()				
				.and()
				.formLogin()
				.loginPage(Iconstants.ROOT_PATH + Iconstants.PAGES.LOGIN.toString().toLowerCase())				
				.defaultSuccessUrl(Iconstants.ROOT_PATH + Iconstants.PAGES.CONVERT.toString().toLowerCase(), false)		
				.and()
				.logout()				
				.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
				.logoutSuccessUrl("/login");
				;
				
				// .defaultSuccessUrl("/dashboard.html")
				// .loginProcessingUrl(Iconstants.ROOT_PATH +
				// Iconstants.PAGES.LOGIN.toString().toLowerCase())


		// This required a SSL certificate to be installed on PC

		/*
		 * .requiresChannel() .antMatchers(Iconstants.ROOT_PATH +
		 * Iconstants.PAGES.REGISTER.toString().toLowerCase() , Iconstants.ROOT_PATH +
		 * Iconstants.PAGES.LOGIN.toString().toLowerCase()) .requiresSecure();
		 */
		

	}

	/*
	 * @Override protected void configure(AuthenticationManagerBuilder auth) throws
	 * Exception {
	 * 
	 * auth.jdbcAuthentication() .dataSource(dataSource)
	 * .usersByUsernameQuery("SELECT username, password, true FROM users WHERE username=?"
	 * )
	 * .authoritiesByUsernameQuery("SELECT username, 'ROLE_USER' FROM users WHERE username=?"
	 * )
	 * 
	 * ; }
	 */

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("ankit@yahoo.com").password("{noop}password").roles("USER")	
		;	
	}



}
