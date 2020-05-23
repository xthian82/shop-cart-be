package py.com.snowtech.shopcart.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class RestServiceCorsApplication {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/products/**").allowedOrigins("*");
                registry.addMapping("/cart/**").allowedOrigins("*");
                registry.addMapping("/post/**").allowedOrigins("*");
                registry.addMapping("/comments/**").allowedOrigins("*");
            }
        };
    }
}
