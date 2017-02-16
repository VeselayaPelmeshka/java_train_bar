package ru.stqa.pft.sandbox;

public class MyFirstProgramm {

	public static void main (String[] args){
		hello("Danil");
		System.out.println(area(9));
		System.out.println(area(4,7));

	}

	public static void  hello(String somebody){

		System.out.println("Hello " + somebody + " !");
	}

	public  static  double area(double n){
		return n*n;
	}

	public  static double area(double a, double b){
		return a*b;
	}

}