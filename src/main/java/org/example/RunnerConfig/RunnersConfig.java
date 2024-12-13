package org.example.RunnerConfig;

import org.example.Data.Result;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("org.example")
public class RunnersConfig {

    @Bean
    public List <Result> resultList(){
        return new ArrayList<>();
    }
}
