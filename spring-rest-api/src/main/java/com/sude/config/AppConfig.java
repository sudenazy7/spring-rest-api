package com.sude.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sude.model.Employee;

@Configuration
public class AppConfig {
	// şu an veri tabanına bağlanmadığımız için veriyi kendimiz
	// burada oluşturucaz.
	
	
	@Bean
	public List<Employee> employeeList(){
		
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee("1", "sude naz", "ay"));
		employeeList.add(new Employee("2", "miya", "ay"));
		employeeList.add(new Employee("3", "batuhan", "keskin"));
		
		return employeeList;
			
	}
	

}
