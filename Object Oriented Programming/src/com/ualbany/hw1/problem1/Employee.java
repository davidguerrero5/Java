// David Guerrero
// 9/15/2017
package com.ualbany.hw1.problem1;

public class Employee {

	public String firstName;
	public String lastName;
	public double monthlySalary;

	public Employee(String fName, String lName, Double mSalary) {
		firstName = fName;
		lastName = lName;
		monthlySalary = mSalary;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @return the monthlySalary
	 */
	public double getMonthlySalary() {
		return monthlySalary;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @param monthlySalary
	 *            the monthlySalary to set
	 */
	public void setMonthlySalary(double monthlySalary) {

		// if the monthly salary is less than 0, the value is set to 0.0
		if (monthlySalary > 0) {
			this.monthlySalary = monthlySalary;
		} else {
			this.monthlySalary = 0.0;
		}
	}

}
