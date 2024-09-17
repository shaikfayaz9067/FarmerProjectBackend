package com.example.FormProject.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry corsRegistry) {
        corsRegistry.addMapping("/**")  // Correct mapping to match all paths
                .allowedOrigins("http://localhost:4200")  // Removed trailing slash
                .allowedMethods("GET", "POST", "DELETE", "PUT");
    }
}
