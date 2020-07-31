package com.imperium.start;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.imperium.calc.Calc;
import com.imperium.model.Stars;

public class GetInfo {

	public static List <Stars> getInfo() {

		File file = new File("List of Stars");
		Scanner sc = null;

		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		List <Stars> stars = new ArrayList <Stars>();

		//iterate through file
		while(sc.hasNextLine()) {
			Stars s = new Stars();			
			String header = sc.nextLine();

			//set the name of the star
			String temp = sc.nextLine();
			String name = Calc.cleanName(temp);
			s.setName(name);

			//set the dob of the star
			temp = sc.nextLine();
			String dob = Calc.cleanDob(temp);
			s.setDob(dob);

			//set the height of the star
			temp = sc.nextLine();
			String height = Calc.cleanHeight(temp);
			s.setHeight(height);

			//set spouses
			//List of Spouses:
			String spousesHeader = sc.nextLine();
			int count = 0;
			List <String> sp = new ArrayList <String>();
			while(count == 0) {
				String st = sc.nextLine();
				if(st.contains("List of Movies")) {
					count++;
				}
				else {
					st = Calc.cleanSpouse(st);
					sp.add(st);
				}
			}
			s.setSpouses(sp);


			//sets movies
			count = 0;
			List <String> movies = new ArrayList <String>();
			while(count == 0) {
				String st = sc.nextLine();
				if(st.contains("Reported Salary")) {
					count++;
				}
				else {
					st = Calc.cleanFilmography(st);
					movies.add(st);
				}
			}
			s.setFilmography(movies);


			//sets salary
			count = 0;
			List <String> salary = new ArrayList <String>();
			while(count == 0) {
				String st = sc.nextLine();
				if(st.contains("End Record")) {
					count++;
				}
				else {
					st = Calc.cleanSalary(st);
					if(!st.equals("Nothing")) {
					salary.add(st);
					}
				}
			}
			s.setSal(salary);

			System.out.println(s.getCounter());

			stars.add(s);

		}


		//Print to console
		for(Stars s : stars) {
			System.out.print(s.getCount() + "\t");
			System.out.print(s.getName() + "\t");
			System.out.print(s.getDob() + "\t");
			System.out.print(s.getHeight() + "\t");
			System.out.print(s.getSpouses() + "\t");
			System.out.print(s.getFilmography() + "\t");
			System.out.println(s.getSal());
		}

		return stars;
	}

}

