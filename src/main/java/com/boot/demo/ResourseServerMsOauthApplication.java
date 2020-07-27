package com.boot.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.resource.ResourceServerProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.provider.token.ResourceServerTokenServices;

@SpringBootApplication
@EnableResourceServer
public class ResourseServerMsOauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResourseServerMsOauthApplication.class, args);
	}
	
	@Autowired
	private ResourceServerProperties resourceServerProperties;
	
	@Bean
	public ResourceServerTokenServices customUserInfoTokenService()
	{	
		return new CustomUserInfoTokenServices(resourceServerProperties.getUserInfoUri(),
				resourceServerProperties.getClientId());
	}

}
