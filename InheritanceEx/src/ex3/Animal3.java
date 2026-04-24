package ex3;

public class Animal3 {
	
	String name;
	int age;
	
	Animal3(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	void show() {
		System.out.println("이름" + name);
		System.out.println("나이" + age);
	}

}
