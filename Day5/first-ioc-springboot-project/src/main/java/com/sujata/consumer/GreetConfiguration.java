package com.sujata.consumer;

import com.sujata.producer.GoodEvening;
import com.sujata.producer.GoodMorning;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetConfiguration {

    @Bean(name = "mrng")
    public GoodMorning getGoodMorning(){
        return new GoodMorning();
    }

    @Bean(name = "eve")
    public GoodEvening getGoodEvening(){
        return new GoodEvening();

    }
}
