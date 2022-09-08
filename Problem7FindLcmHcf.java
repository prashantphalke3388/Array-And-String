package com.array.assignment;

import java.util.Scanner;

//WAP to find the LCM and HCF of array numbers.
public class Problem7FindLcmHcf {
	 public static void main(String[] args) {

	       int a, b, temp_a, temp_b, temp, HCF, LCM;
	        Scanner sc = new Scanner(System.in);

	       System.out.println("Enter the first Number: ");
	        a = sc.nextInt();
	        System.out.println("Enter the Second Number: ");
	        b = sc.nextInt();
	        sc.close();

	       temp_a = a;
	       temp_b = b;

	       while (temp_b != 0) {
	            temp = temp_b;
	            temp_b = temp_a % temp_b;
	            temp_a = temp;
	        }

	       HCF = temp_a;
	        LCM = (a * b) / HCF;

	       System.out.println("HCF = " + HCF);
	        System.out.println("LCM =  " + LCM);
	    }



}