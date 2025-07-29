package com.sujata.consumer;

import com.sujata.presentation.SharePresentationImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;

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

		ApplicationContext applicationContext= SpringApplication.run(FirstIocSpringbootProjectApplication.class, args);

		SharePresentationImpl sharePresentation=(SharePresentationImpl) applicationContext.getBean("presentation");
		Scanner scanner=new Scanner(System.in);
		while(true){
			sharePresentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			sharePresentation.performChoice(choice);
		}
	}



}
