package com.leap_year;

import java.util.Scanner;

public class LeapYearCheck {

	public static void main(String[] args) {
		 
		       
		        Scanner scanner = new Scanner(System.in);

		        // Ask user to enter a year
		        System.out.print("Enter a year: ");
		        int year = scanner.nextInt();

		        
		        boolean isLeap = false;

		        if (year % 4 == 0) {
		            if (year % 100 == 0) {
		                // Year is divisible by 100, check 400
		                if (year % 400 == 0) {
		                    isLeap = true;  // Divisible by 400 => Leap year
		                } else {
		                    isLeap = false; // Not divisible by 400 => Not a leap year
		                }
		            } else {
		                isLeap = true; // Divisible by 4 but not by 100 => Leap year
		            }
		        } else {
		            isLeap = false; // Not divisible by 4 => Not a leap year
		        }

		        
		        if (isLeap) {
		            System.out.println(year + " is a leap year.");
		        } else {
		            System.out.println(year + " is not a leap year.");
		        }

		      
		        scanner.close();
		    }

	}

