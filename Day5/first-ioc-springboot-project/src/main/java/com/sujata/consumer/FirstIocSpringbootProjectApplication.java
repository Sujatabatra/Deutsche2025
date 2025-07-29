package com.sujata.consumer;

import com.sujata.producer.GoodEvening;
import com.sujata.producer.GoodMorning;
import com.sujata.producer.Greet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

/*
While being the component consumer,
need not to worry about component objects life cycle ,
Spring Container will going to maintain that for you

Spring Container is Object of ApplicationContext

SpringContainer needs one configuration file,
which tell what all component life cycle is supposed to be run.

In Spring Boot : we create configuration file with a help of Java Class
Spring boot itself will launch ApplicationContext , one we start an application

Current Class can act like configuration file or
we can create seperate class for configuration and annotate that class with @Configiration
 */
@SpringBootApplication
public class FirstIocSpringbootProjectApplication {

	public static void main(String[] args) {
		//Consumer
		ApplicationContext applicationContext= SpringApplication.run(FirstIocSpringbootProjectApplication.class, args);

		Greet greet=(Greet)applicationContext.getBean("mrng");
		greet.wish("Avani");
		System.out.println("greet"+ greet);

		Greet greet1=(Greet)applicationContext.getBean("mrng");
		greet.wish("Parth");
		System.out.println("greet1"+ greet1);
	}


	//Configuration used by Spring Container(Application Context)
//	@Bean(name = "mrng")
//	public GoodMorning getGoodMorning(){
//		return new GoodMorning();
//	}
//
//	@Bean(name = "eve")
//	public GoodEvening getGoodEvening(){
//		return new GoodEvening();
//
//	}
}
