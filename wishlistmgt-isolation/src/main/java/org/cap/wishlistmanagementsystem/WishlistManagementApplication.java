package org.cap.wishlistmanagementsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.client.RestTemplate;

/**
 * this is equal to three annotations
 * 1) @Configuration
 * 2)@ComponentScan
 * 3)@EnableAutoConfiguration
 */
@SpringBootApplication(scanBasePackages="org.cap")
@EnableTransactionManagement
public class WishlistManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(WishlistManagementApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
}