package com.imperium.playground;

import java.util.ArrayList;
import java.util.List;

public class Playground {

	public static void main(String[] args) {

		String name = "Tom Cruise";

		String dob = "July 3, 1962";

		//height 5' 7" 1.7 m
		String height = "5' 7\" 1.7 m";
		int heightc =  (5 * 12) + 7;
		double heightm = 1.7;

		//List of Spouses
		List <String> spouses = new ArrayList<String>();
		spouses.add("Katie Holmes");
		spouses.add("Nicole Kidman");
		spouses.add("Mimi Rogers");

		//List of Movies
		List <String> filmography = new ArrayList<String>();
		filmography.add("Mission: Impossible 7	 Date:  2021");
		filmography.add("Luna Park	 Date: TBA");
		filmography.add("Untitled Tom Cruise/SpaceX Project	 Date: TBA");
		filmography.add("Mission: Impossible 8	 Date:  2022");
		
		//Reported Salary
		List <String> sal = new ArrayList<String>();
		sal.add("Taps (1981)	$50,000");
		sal.add("Risky Business (1983)	$75,000");				
		sal.add("Legend (1985)	$500,000");		
		sal.add("Top Gun (1986)	$2,000,000");
				
		




		System.out.println("Hello");

	}

}
