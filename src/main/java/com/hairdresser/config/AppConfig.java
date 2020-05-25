package com.hairdresser.config;

import com.hairdresser.Model.dao.Rolee;
import com.hairdresser.Repository.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Optional;

@Configuration
public class AppConfig {

    @Bean
    public CommandLineRunner commandLineRunner (RoleRepository roleRepository) {
        return args -> {
            //todo
            Optional<Rolee> roleUser = roleRepository.findByName("ROLE_USER");
            if (!roleUser.isPresent()) {
                roleRepository.save(Rolee.builder().name("ROLE_USER").build());
            }

            Optional<Rolee> roleAdmin = roleRepository.findByName("ROLE_ADMIN");
            if (!roleAdmin.isPresent()) {
                roleRepository.save(Rolee.builder().name("ROLE_ADMIN").build());
            }
        };
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
