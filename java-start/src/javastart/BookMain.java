package javastart;

import java.util.Scanner;

class Bookk{ // 클래스 = 변수(속성) + 메서드(기능)
	// 멤버변수(필드) : title(책제목, 문자열), author(작가,문자열)
	// 메서드 : show() -> title 과 author 출력
	//생성자 : 1) 매개변수 있는 생성자 (초기값은 "" 을 지정)
	//	2) 매개변수 1개(title) : author는 작가 미상
	//	3) 매개변수 2개(title, author)
	
	
	String title; // 멤버변수(필드)
	String author;
	
	// 생성자 오버로딩
	// 생성자 : 객체를 생성할때 초기값을 줌.
	Bookk(){ // 매개변수가 없는 생성자
		// title = "";
		// author = "";
		this("",""); 
		System.out.println("기본생성자 호출");
		
	}
	Bookk(String title){ // 매개변수가 1개인 생성자
	//	this.title = title; // 왼쪽 title = 멤버변수 오른쪽 title = 생성자 안 매개변수
	//	author = "미상";
		this(title,"미상");
		
		
	}
	Bookk(String title,String author){ // 매개변수가 2개인 생성자
		this.title = title;
		this.author = author;
	}
	
	
	void show() { // 메서드
		System.out.println("제목 : "+title);
		System.out.println("작가 : "+author);
		
	}
}

public class BookMain {

	public static void main(String[] args) {
		
	Bookk b1 = new Bookk(); // 생성자 매개변수가 없는 객체 1번째 생성
	Bookk b2 = new Bookk("워더링하이츠"); // 생성자 매개변수가 1개인 객체 2번째 생성
	Bookk b3 = new Bookk("워더링하이츠","에밀리 브론테"); // 생성자 매개변수가 2개인 객체 3번째 생성
		
	Scanner s1 = new Scanner(System.in);
	
	System.out.println("책과 작가의 이름을 적어주세요..>>");
	String t1 = s1.nextLine();
	String a1 = s1.nextLine();
	
	Bookk bk1 = new Bookk(t1,a1);
	bk1.show();
	
		
		s1.close();
	}

}




//this는 현재 작동 중인 객체 자신을 가리키는 참조 변수입니다. 주로 매개변수와 멤버 변수의 이름이 같을 때 이를 구분하기 위해 사용
//this()는 같은 클래스 안에 있는 다른 생성자를 호출할 때 사용하는 특수한 문법입니다. 코드의 중복을 줄이기 위해 사용
//
//this() 설명
//① 생성자에서만 사용 가능
//this();  // 생성자 안에서만 사용 가능
//② 반드시 첫 줄에 써야 함
//Car() {
//    this("Avante");  // 반드시 첫 줄
//}
//
//Car() {
//    speed = 100;
//    this("Avante"); // 에러
//}
//③ 자기 자신을 계속 호출하면 안됨 (무한루프)
//Car() {
//    this(); //  무한 호출 → 컴파일 에러