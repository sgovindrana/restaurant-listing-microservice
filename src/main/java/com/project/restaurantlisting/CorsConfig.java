package com.project.restaurantlisting;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    // Override addCorsMappings to add the CORS mappings globally
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")   // Allow CORS for all paths
                .allowedOrigins("http://localhost:4200")  // Your frontend's URL (can be wildcard * for any)
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Allow these HTTP methods
                .allowedHeaders("*")  // Allow all headers
                .allowCredentials(true)  // Allow cookies/credentials if needed
                .maxAge(3600);  // Cache pre-flight response for 1 hour
    }
}