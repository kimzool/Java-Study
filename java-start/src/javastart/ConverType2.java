package javastart;

import java.util.Scanner;

public class ConverType2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("실수를 문자로 입력..>>");
		String input = scanner.nextLine();
		
		double d = Double.parseDouble(input);
		
		String str1 = Double.toString(d);
		String str2 = String.valueOf(d);
		
		System.out.println("input : "+input);
		System.out.println("d : "+d);
		System.out.println("str1 (toString) : "+str1);
		System.out.println("str2 (valueOf) : "+str2);

		
		scanner.close();
	}

}
