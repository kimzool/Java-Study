package test;

//부모 , 슈퍼 클래스

public class AnimalEx {

		String name;
		int age;
		
		void show() {
			System.out.println("이름" + name);
			System.out.println("나이" + age);
		}
		
		AnimalEx(String name,int age){
			this.name = name;
			this.age = age;
		}
}
