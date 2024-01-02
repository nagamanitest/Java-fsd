package com.simplilearn.junit;

public class Agecalculator {

	public int calculateAge(int yearOfBirth) {
		int currentYear = 2023;
		if(yearOfBirth>0 &&yearOfBirth<currentYear )
			return  currentYear-yearOfBirth;
		else
			return 0;
		
	}
	
	// calculate retirement
		public boolean isRetired(int yearOfBirth) {
			int age  = calculateAge(yearOfBirth);
			int retAge = 60;
			if(age> retAge) {
				return true;
			} else {
				return false;
			}
		}
}
