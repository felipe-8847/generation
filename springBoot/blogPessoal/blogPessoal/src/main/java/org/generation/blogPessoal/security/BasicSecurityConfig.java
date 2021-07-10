package org.generation.blogPessoal.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@EnableWebSecurity
public class BasicSecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private UserDetailsService service;
	
	
	@Override
 	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.inMemoryAuthentication().withUser("admin").password(passwordEncoder().encode("admin")).authorities("ROLE_ADMIN");
 		auth.userDetailsService(service);
 	}

	@Bean
	public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
	
	@Override
 	protected void configure(HttpSecurity http) throws Exception {
		
 		http.authorizeRequests()
 		.antMatchers(HttpMethod.GET,"/usuario/todos").permitAll()
 		.antMatchers(HttpMethod.GET,"/tema").permitAll()
 		.antMatchers(HttpMethod.GET,"/postagens").permitAll()
 		.antMatchers(HttpMethod.GET,"/usuario").permitAll()
 		.antMatchers(HttpMethod.POST,"/tema").permitAll()
 		.antMatchers(HttpMethod.POST,"/postagens").permitAll()
 		.antMatchers(HttpMethod.POST,"/usuario/login").permitAll()
 		.antMatchers(HttpMethod.POST,"/usuario/novo").permitAll()
 		.antMatchers(HttpMethod.PUT,"/usuario/alterar").permitAll()
 		.antMatchers(HttpMethod.POST,"/usuario/salvar").permitAll()

 		.anyRequest().authenticated()
 		.and().httpBasic()
 		.and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
 		.and().cors()
 		.and().csrf().disable();
 	}
}
