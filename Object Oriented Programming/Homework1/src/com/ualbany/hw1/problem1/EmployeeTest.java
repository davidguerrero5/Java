// David Guerrero
// 9/15/2017
package com.ualbany.hw1.problem1;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		// creates cashier employee
		Employee cashier = new Employee("David", "Guerrero", 100.0);
		
		// prints cashier attributes
		System.out.println("The name of the employee is " + cashier.getFirstName() + " " + cashier.getLastName() + " and his monthly salary is "
				+ cashier.getMonthlySalary());

		// creates manager employee
		Employee manager = new Employee("Andy", "Weisenborn", 200.0);
		
		// prints manager attributes
		System.out.println("The name of the employee is " + manager.getFirstName() + " " + manager.getLastName() + " and his monthly salary is "
				+ manager.getMonthlySalary());
		
		// calculates raise of 10% for each employee
		cashier.setMonthlySalary(cashier.getMonthlySalary() * 1.1);
		manager.setMonthlySalary(manager.getMonthlySalary() * 1.1);
		
		// prints the new names and salaries of each employee
		System.out.println("The name of the employee is " + cashier.getFirstName() + " " + cashier.getLastName() + " and his  new and improved"
				+ "monthly salary is " + cashier.getMonthlySalary());
		
		System.out.println("The name of the employee is " + manager.getFirstName() + " " + manager.getLastName() + " and his new and improved"
				+ " monthly salary is " + manager.getMonthlySalary());
	}

}
