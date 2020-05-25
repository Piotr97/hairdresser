package com.hairdresser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableWebSecurity
@EnableSwagger2
@EnableCaching
@SpringBootApplication
public class HairdresserApplication {

    public static void main(String[] args) {
        SpringApplication.run(HairdresserApplication.class, args);
    }

}
