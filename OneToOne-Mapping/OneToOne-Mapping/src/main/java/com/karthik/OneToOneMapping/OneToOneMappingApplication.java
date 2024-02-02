package com.karthik.OneToOneMapping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.karthik.OneToOneMapping.service.PersonService;

@SpringBootApplication
public class OneToOneMappingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(OneToOneMappingApplication.class, args);
		
		PersonService bean = ctx.getBean(PersonService.class);
		//bean.saveData();
		bean.delete();
	
	}

}
