package com.pablinchapin.sociallogin;

import com.pablinchapin.sociallogin.configuration.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class SocialloginApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocialloginApplication.class, args);
	}

}
