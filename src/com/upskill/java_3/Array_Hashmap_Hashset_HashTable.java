package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
		
		//Array store multiple data using index
		
		int age = 30;
		
		int[] ageCrash = new int []{25, 28, 30, 32, 35, 29};
		
		//Array index               [1] [2] [3] [4] [5] [6]
		
		String[] nameCrash = new String []{"Rauf", "Rebaka"," Siful", "Rozony"};
				
		
		System.out.println("Student Age : "+ ageCrash[4]);
		System.out.println("Total Student :" + ageCrash.length);
		System.out.println("Name of Student:" + nameCrash.length);
		System.out.println("Student Name :" + nameCrash[3]);
		
		
			
			int [][] ageCrash2D = {{25, 28, 30, 32, 35, 29},  //[0][0] [0][1] [0][2] [0][3]
					               {26, 29, 34}};	          //[1][0] [1][1] [1][2] [1][3]
			
			System.out.println("Student Age 2d :" + ageCrash2D[1][0]);
			
			HashMap<String, Integer> Student = new HashMap<String, Integer>();
			
			
			Student.put("Rauf",29);
			Student.put("Rebaka",30);
			Student.put("Siful",28);
			Student.put("Rozony",25);
			
			System.out.println("Hashmap Student Age :" + Student.get("Rozony"));
			
			HashMap<String, String> Capital = new HashMap<String, String>();
			
			Capital.put("India", "Delhi");
			Capital.put("China", "Beijing");
			Capital.put("UAE", "Dubai");
			Capital.put("Germany", "Berlin");
			
			
			System.out.println("Capital City : " + Capital.get("China"));
			
			
			Hashtable<String, String> Region = new Hashtable<String, String>();
			 
			Region.put("GERMANY", "EUROPE");
			Region.put("CHINA", "ASIA");
			
			System.out.println("Region : " + Region.get("GERMANY"));
			
			
			HashSet<String> car = new HashSet<String>();
			
			car.add("jaguar");
			car.add("Bugati");
			car.add("Rolls Royce");
			car.add("Porsche");
			
			System.out.println("Car : " + car);
			
			
			}
		}
		
		
	
