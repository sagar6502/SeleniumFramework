package edu.testng;

import java.util.Scanner;

public class Check {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		isPerfectNumber(n);
		if(isPerfectNumber(n)) {
			System.out.println("It is perfect number");
		}else {
			System.out.println("It is not perfect number");
		}
	}

	private static boolean isPerfectNumber(int n) {
		// TODO Auto-generated method stub
		int sum =0; 
		for(int i=1; i<n;i++) {
			if(n%i==0) {
				sum = sum+i;
			}
		}
		return sum==n?true:false;
	}
}
