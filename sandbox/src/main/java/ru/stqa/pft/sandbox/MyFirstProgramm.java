package ru.stqa.pft.sandbox;

public class MyFirstProgramm {

	public static void main (String[] args){
		hello("Danil");

		Square s = new Square(5);

		System.out.println(s.area());

		Rectangle f = new Rectangle(9,2);

		System.out.println(f.area());

	}

	public static void  hello(String somebody){

		System.out.println("Hello " + somebody + " !");
	}
}