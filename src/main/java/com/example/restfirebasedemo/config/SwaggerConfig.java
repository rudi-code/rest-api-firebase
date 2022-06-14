/**
 * 
 */
package com.example.restfirebasedemo.config;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;


/**
 * @author rudi_
 * @date Nov 22, 2021
 */

@Configuration
public class SwaggerConfig {
	
	/*
	 * @Bean public GroupedOpenApi userOpenApi() { String packagesToscan[] =
	 * {"com.example.restfirebasedemo.controller"}; return
	 * GroupedOpenApi.builder().packagesToScan(packagesToscan) .build(); }
	 */
	
	@Bean
	  public OpenAPI springShopOpenAPI() {
	      return new OpenAPI()
	              .info(new Info().title("restfirebase API")
	              .description("Spring sample application")
	              .version("v0.0.1")
	              .license(new License().name("Apache 2.0").url("http://springdoc.org")))
	              .externalDocs(new ExternalDocumentation()
	              .description("SpringShop Wiki Documentation")
	              .url("https://springshop.wiki.github.org/docs"));
	  }

}
