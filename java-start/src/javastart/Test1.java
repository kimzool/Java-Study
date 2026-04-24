package javastart;

public class Test1 {

	public static void main(String[] args) {
		
		Person p = new Person("john",19);
		
		p.checkAdult();

	}

}

class Person {
	
	String name;
	int age;
	
	
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	void checkAdult() {
		if(age >= 19) {
			System.out.println("이름 : "+name);
			System.out.println("나이 : "+age);
			System.out.println("성인 입니다");
		}
		else if(age >= 10) {
			System.out.println("이름 : "+name);
			System.out.println("나이 : "+age);
			System.out.println("청소년 입니다");
		}
		else {
			System.out.println("이름 : "+name);
			System.out.println("나이 : "+age);
			System.out.println("어린이 입니다");
		}
	}
	
}
