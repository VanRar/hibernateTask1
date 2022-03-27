package ru.netology.hibernatetask1.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityApp extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("admin").password("{noop}admin").authorities("read", "write")
                .and()
                .withUser("user").password("{noop}user").authorities("read");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin()
                .and()
                .authorizeHttpRequests().antMatchers("/persons/by-city").permitAll()
                .and()
                .authorizeHttpRequests().antMatchers("/persons/by-age").hasAuthority("write")
                .and()
                .authorizeHttpRequests().antMatchers("/persons/by-name-surname").hasAuthority("write");
//                .and()
//                .authorizeHttpRequests().anyRequest().authenticated();


    }
}
