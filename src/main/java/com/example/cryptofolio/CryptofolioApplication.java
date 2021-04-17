package com.example.cryptofolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CryptofolioApplication {

	public static void main(String[] args) {
		SpringApplication.run(CryptofolioApplication.class, args);
	}

	/* Pour la version serveur

	@Bean
	RestTemplate getRestTemplate(){
		return new RestTemplate();
	}*/

}
