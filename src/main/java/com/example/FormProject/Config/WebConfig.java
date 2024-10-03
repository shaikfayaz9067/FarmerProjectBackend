package com.example.FormProject.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry corsRegistry) {
        corsRegistry.addMapping("/**")  // Allow all paths
                .allowedOrigins("http://localhost:3000", "http://localhost:4200","http://localhost:5000")  // Allow both origins
                .allowedMethods("GET", "POST", "DELETE", "PUT")
                .allowedHeaders("*");  // Allow all headers if needed
    }
}
