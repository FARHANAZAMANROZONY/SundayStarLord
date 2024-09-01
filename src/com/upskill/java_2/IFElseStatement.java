package com.upskill.java_2;

public class IFElseStatement {

	public static void main(String[] args) {
		
		int age = 99;
		
		if (age <=13){
			
			System.out.println("you are children");	
		} else if(age > 13 && age <18 ){
			System.out.println("you are Teenager");
			
		} else if (age >=55){
			if(age < 100){
				System.out.println("you are survivor");
				}else{
			System.out.println("you are senior");}	
		}else {
			System.out.println("you are adult");
		}

	}

}
