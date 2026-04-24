package javastart;



class Book {
	String title;
	int price;
	
	Book(String a,int b){ // 객체 생성시 인자 2개
		title = a;
		price = b;
	}
	Book(String i){ // 객체 생성시 인자 1개
		title = i;
		price = 0;
	}
	Book(){ // 객체 생성시 인자 0개
		title = "c언어의 정석";
		price = 0;
		
	}

	void showPrice() {
		System.out.println("도서 제목 : "+title);
		System.out.println("가격 : "+price);
		
	}
}


public class MainBook {

	public static void main(String[] args) {
		
		Book myBook = new Book("자바의정석",20000);
		Book myBook2 = new Book("자바의정석");
		Book myBook3 = new Book();
		
		//myBook.title = "자바의정석";
		//myBook.price = 20000;
		
		myBook.showPrice();
		myBook2.showPrice();
		myBook3.showPrice();
	

	}

}
