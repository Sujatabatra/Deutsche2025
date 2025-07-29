package com.sujata.consumer;

import com.sujata.persistence.ShareDaoImpl;
import com.sujata.presentation.SharePresentationImpl;
import com.sujata.service.ShareServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
IOC : Inversion of Control : Seperating depedency logic from the actual bussiness logic of our application
Benefit : code becomes losely coupled and maintainable
we achive IOC either with Constructor Injection or Setter Injection
 */
@Configuration
public class ShareConfig {

    @Bean(name="dao")
    public ShareDaoImpl getDao(){
        return new ShareDaoImpl();
    }

    //Setter Injection
    @Bean(name="service")
    public ShareServiceImpl getService(){
        ShareServiceImpl service=new ShareServiceImpl();
        service.setShareDao(getDao());
        return service;
    }

//    Constructor Injection
    @Bean(name="presentation")
    public SharePresentationImpl getPresentation(){
        return new SharePresentationImpl(getService());
    }
}
