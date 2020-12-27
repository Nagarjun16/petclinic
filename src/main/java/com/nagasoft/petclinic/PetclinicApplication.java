package com.nagasoft.petclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PetclinicApplication {

	private static ConfigurableApplicationContext ctx;

	public static void main(String[] args) {
		ctx=SpringApplication.run(PetclinicApplication.class, args);
		Object bean = ctx.getBean("BookController");
		System.out.println(bean);
	}

}
