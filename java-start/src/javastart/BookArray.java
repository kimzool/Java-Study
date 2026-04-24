package javastart;

import java.util.Scanner;

class BookA{
	String title;
	int price;
	
	BookA(String title,int price){
		this.title = title;
		this.price = price;
	}
}

public class BookArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BookA[] b = new BookA[3];
		
		for(int i = 0; i < b.length; i++) {
			System.out.println("Please enter a title : ");
			String title = sc.nextLine();
			System.out.println("Please enter price : ");
			int price = sc.nextInt();
			sc.nextLine();
			b[i] = new BookA(title,price);
		}
		
		for(int i = 0; i < b.length; i++) {
			System.out.println("제목 : " + b[i].title + " , " + "가격 : " + b[i].price);
		}
		sc.close();

	}

}
