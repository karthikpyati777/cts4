package com.karthik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.karthik.service.EmployeeService;

@SpringBootApplication
public class OtmMappingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(OtmMappingApplication.class, args);
		EmployeeService bean = run.getBean(EmployeeService.class);
		bean.saveData();
	}

}
