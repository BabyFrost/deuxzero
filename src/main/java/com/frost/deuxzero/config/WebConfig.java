package com.frost.deuxzero.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@SuppressWarnings("deprecation")
@Configuration
@EnableWebMvc
//public class WebConfig extends WebMvcConfigurerAdapter {
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
        		.allowedOrigins("*")
        		.allowedMethods("GET", "PUT", "POST", "PATCH", "DELETE", "OPTIONS");
        		
    }
    
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/static/");
    }
    
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//    	registry
//        	.addResourceHandler("/resources/**")
//        		.addResourceLocations("/resources/");
//    	
//    	registry
//    		.addResourceHandler("/js/**")
//    			.addResourceLocations("classpath:/static/js/");
//    	
//        registry
//        	.addResourceHandler("/css/**")
//        		.addResourceLocations("classpath:/static/css/");
//        
//        registry
//        	.addResourceHandler("swagger-ui.html")
//        		.addResourceLocations("classpath:/META-INF/resources/");
//
//        registry
//        	.addResourceHandler("/webjars/**")
//        		.addResourceLocations("classpath:/META-INF/resources/webjars/");
//    }
    
}