package com.example.demo;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

public class WebSecurityConfigurerAdapter {

	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
        .inMemoryAuthentication()
            .withUser("user")
            .password("{noop}123")
            .roles("USER")
        .and()
            .withUser("admin")
            .password("{noop}123")
            .roles("USER", "ADMIN");
}

}
