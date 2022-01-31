package com.encuesta.encuesta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;

@SpringBootApplication
public class EncuestaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EncuestaApplication.class, args);

	}

	/**
	 * configuracion CORS rest
	 * @return source
	 */
	@Bean
	CorsConfigurationSource corsConfigurationSource()
	{
		CorsConfiguration configuration = new CorsConfiguration();
		configuration.setAllowedOrigins(Arrays.asList("http//localhost:4200"));
		configuration.setAllowedMethods(Arrays.asList("GET","POST"));
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", configuration);
		return source;
	}


	/*
	*
	* @Bean
 CorsConfigurationSource corsConfigurationSource() {
  CorsConfiguration cc = new CorsConfiguration();
                cc.setAllowedHeaders(Arrays.asList("Origin,Accept", "X-Requested-With", "Content-Type", "Access-Control-Request-Method", "Access-Control-Request-Headers","Authorization"));
                cc.setExposedHeaders(Arrays.asList("Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"));
  cc.setAllowedOrigins(Arrays.asList("/*"));
  cc.setAllowedMethods(Arrays.asList("GET", "POST", "OPTIONS", "PUT","PATCH"));
                cc.addAllowedOrigin("*");
                cc.setMaxAge(Duration.ZERO);
                cc.setAllowCredentials(Boolean.TRUE);
  UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
  source.registerCorsConfiguration("/**", cc);
  return source;
 }
	* */


}
