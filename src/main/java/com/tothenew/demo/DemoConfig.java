package com.tothenew.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DemoConfig
{
    @Bean
    DemoService demoService()
    {
        return new DemoService("Recliner");
    }
//5) Demonstrating how you will resolve ambiguity while autowiring bean (Hint : @Primary)
    @Bean
    @Primary
    DemoService demoService2()
    {
        return new DemoService("Pizza");
    }


}
