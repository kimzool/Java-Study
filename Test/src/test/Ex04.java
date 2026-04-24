package test;

class Car{ // 설계도 class
	String model;
	int speed;
	
	// 생성자(매개변수(model,speed) 2개)
	Car(String model,int speed){
		this.model = model; // 왼쪽 model -> 필드(멤버 변수), 오른쪽 model은 매개변수
		this.speed = speed;
	}
	
	// 메서드 -> 기능,행위
	
	void showprint() {
		System.out.println("차의 종류 : "+model+ " 차의 속력 : "+speed);
		
	}
	
}

public class Ex04 {
	
		public static void main(String[] args) {
			
			// 객체 생성(생성자 호출)
			Car c1 = new Car("포르쉐",50);
			Car c2 = new Car("람보르기니",50);
			
			// 메서드 호출
			c1.showprint();
			c2.showprint();
		}

}
