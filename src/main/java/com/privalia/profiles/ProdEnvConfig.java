package com.privalia.profiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public class ProdEnvConfig {
	@Bean
	public User user(){
		return new User(111,"Prod User");
	}
}
