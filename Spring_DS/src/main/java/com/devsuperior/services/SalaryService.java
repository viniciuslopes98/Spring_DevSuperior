package com.devsuperior.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.entities.Employee;
@Service
public class SalaryService {
	
	@Autowired
	private TaxService taxService;
	
	@Autowired
	private PensionService pensionService;

	
	public double netSalary(Employee employee) {
		return employee.getGrossSalary() - taxService.tax(employee.getGrossSalary())
				- pensionService.discount(employee.getGrossSalary());
	}
}
