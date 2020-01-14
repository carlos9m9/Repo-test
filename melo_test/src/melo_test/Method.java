package melo_test;
import java.util.Scanner;

public class Method {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("What's your name?\n");
		
		String name=inp.nextLine();
		System.out.println("Hi, "+name);
	}

}
