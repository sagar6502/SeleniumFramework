package edu.testng;

import java.util.*;

public class FibonacciNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a upper limit of fibonacci series: d");
		int d = sc.nextInt();
		System.out.println("Enter the number to be checked: n");
		int n = sc.nextInt();
		if(isFibonacciSeries(d,n)) {
			System.out.println("Number "+n+" lies with the fibonacci series upto "+ d);
		}else {
			System.out.println("No, Number "+ n+" does not lie within the fibonacci series upto " + d);
		}
		sc.close();
	}

	private static boolean isFibonacciSeries(int d, int n) {
		// TODO Auto-generated method stub
		if(n>d) {
			return false;
		}
		if(n<-1 && d<-1) {
			return false;
		}
		ArrayList<Integer> arr = GenerateSeries(d);
		return arr.contains(n)?true:false;
	}

	private static ArrayList<Integer> GenerateSeries(int d) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int a = 0,b = 1,c=1;
		if(d<1) {
			return null;
		}
		if(d>=1) {
			arr.add(a);
		}if(d>=2) {
			arr.add(b);
			if(d>2) {
				 do{ 
					c = a+b;
					arr.add(c);
					a=b;
					b=c;
				}while(c<d);
			}
		}
		
		return arr;
	}
}
