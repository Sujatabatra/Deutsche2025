package com.sujata.client;

import com.sujata.presentation.SharePresentation;
import com.sujata.presentation.SharePresentationImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Scanner;

@SpringBootApplication(scanBasePackages = "com.sujata")
@EntityScan(basePackages = "com.sujata.entity")
@EnableJpaRepositories(basePackages = "com.sujata.persistence")
public class PostgresJpaDemoProjectApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext= SpringApplication.run(PostgresJpaDemoProjectApplication.class, args);
		Scanner scanner=new Scanner(System.in);
		SharePresentation sharePresentation=(SharePresentationImpl)applicationContext.getBean("presentation");
		while(true){

			sharePresentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			sharePresentation.performChoice(choice);
		}
	}

}
