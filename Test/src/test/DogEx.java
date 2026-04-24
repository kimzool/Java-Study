package test;

// 자식 , 서브 클래스

public class DogEx extends AnimalEx{
	String breed;

	DogEx(String name,int age,String breed){
		super(name,age); 
		this.breed = breed;
	}
	
	void showDog() {
		System.out.println("품종 : "+breed);
	}
	
	
}
