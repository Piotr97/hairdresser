package com.hairdresser.config;

import com.hazelcast.config.Config;
import com.hazelcast.config.MapConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HazelcastConfig {

    @Bean
    public Config config(){
        return new Config().setInstanceName("hazelcast-instance1").addMapConfig(new MapConfig().setName("subscription"));
    }
}
