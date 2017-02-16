package ru.stqa.pft.sandbox;

public class MyFirstProgramm {

	public static void main (String[] args){
		hello("Danil");

		Square s = new Square(8);

		System.out.println(area(s));

		Rectangle f = new Rectangle(1,9);

		System.out.println(area(f));

	}

	public static void  hello(String somebody){

		System.out.println("Hello " + somebody + " !");
	}

	public  static  double area(Square s){
		return s.l*s.l;
	}

	public  static double area(Rectangle f){
		return f.a * f.b;
	}

}