package com.github.com.ProductCode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@Configuration
public class ProductCodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductCodeApplication.class, args);
    }

}
