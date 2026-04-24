
package javastart;



class Student { // 클래스 ( 설계도 ) 생성
	// 클래스 = 멤버 변수(필드) (속성) + 메서드(기능) 구성
	
	String name; // 멤버변수
	int score; // 멤버 변수
	
	// 생성자 constructor : 객체를 생성할때 값을 부여
	Student(String n,int s){ // 생성자 ( 클래스 이름과 동일 )
		name = n;
		score = s;
	}
	
	// 메서드 정의 (기능 , 행위 )
	void printInfo(){
		
		System.out.println(name+"  ,"+score);
	}
	
}


public class Main { // 실행하는 클래스

	public static void main(String[] args) { // main method
		
		Student st1 = new Student("홍길동",90); // 객체(인스턴스) 생성
		Student st2 = new Student("이순신",100); // 객체(인스턴스) 생성

		// new : 객체 생성 연산자
		// Student(): 클래스
		// s1: 참조변수 , 객체 생성
		
		System.out.println("이름은 : "+st1.name);
		
	//	st1.name = "홍길동"; // s1.name 에서 . 은 멤버 접근 연산자	
	//	st1.score = 90;
		st1.printInfo(); // 메서드 호출
		

		st2.printInfo();
		
		System.out.println("이름은 : "+st1.name);
		System.out.println("점수는 : "+st1.score);
		
		System.out.println("이름은 : "+st2.name);
		System.out.println("점수는 : "+st2.score);

	}

}
