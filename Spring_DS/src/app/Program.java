package app;

import java.util.Scanner;

import entities.Employee;
import services.BrazilTaxService;
import services.PensionService;
import services.SalaryService;
import services.TaxService;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Nome: ");
		String name = sc.nextLine();
		
		System.out.print("Salario bruto: ");
		double grossSalary = sc.nextDouble();
		
		TaxService taxService = new BrazilTaxService();
		PensionService pensionService = new PensionService();
		
		Employee employee = new Employee(name, grossSalary);
		SalaryService salaryService = new SalaryService(taxService, pensionService);
		
		double netSalary = salaryService.netSalary(employee);
		
		System.out.printf("Salario liquido = %.2f%n",  netSalary);
		sc.close();

	}

}
