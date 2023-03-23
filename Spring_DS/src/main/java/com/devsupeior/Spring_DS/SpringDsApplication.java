package com.devsupeior.Spring_DS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.devsuperior.entities.Employee;
import com.devsuperior.services.SalaryService;

@SpringBootApplication
@ComponentScan({"com.devsuperior"})
public class SpringDsApplication implements CommandLineRunner {

	@Autowired
	private SalaryService salaryService;
	
	

	public static void main(String[] args) {
		SpringApplication.run(SpringDsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Employee employee = new Employee("Maria", 4000);
		System.out.println(salaryService.netSalary(employee));
		
	}

}
