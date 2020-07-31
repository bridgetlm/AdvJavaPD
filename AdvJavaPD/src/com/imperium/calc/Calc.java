package com.imperium.calc;

public class Calc {

	public static void main(String[] args) {
		String name = "This Boy's Life	 Date:  1993";

		int i = name.indexOf(" Date:");

		String temp = name.substring(0, i);	

		System.out.println(temp);

	}

	public static String cleanName(String name) {

		String temp = name.substring(6);

		return temp;

	}

	public static String cleanDob(String dob) {

		String temp = dob.substring(6, dob.indexOf(" in"));

		return temp;
	}

	public static String cleanHeight(String height) {

		String temp = height.substring(8);

		return temp;
	}

	public static String cleanSpouse(String spouse) {

		int i = spouse.indexOf(",");

		if(i != -1) {
			spouse = spouse.substring(0, i);
		}

		return spouse;
	}

	public static String cleanFilmography(String filmography) {

		filmography = filmography.substring(0, filmography.indexOf(" Date:"));

		return filmography.trim();

	}

	public static String cleanSalary(String salary) {

		int sub1 = salary.indexOf('$');

		if(sub1 != -1) {

			String temp = salary.substring(sub1);

			int sub2 = temp.indexOf(' ');

			if(sub2 != -1) {
				salary = salary.substring(0, (sub1 + sub2));
			}	

		}

		else {
			salary = salary + "$0";
		}
		return salary;

	}

}
