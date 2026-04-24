package javastart;


class Car{
	
	String model;
	int speed;
	
	Car(String model,int speed){

		this.model = model;
		this.speed = speed;
		// this : 왼쪽 변수 - 객체변수 , 오른쪽 변수 - 매개변수
		// this : 객체 자신
	}
	Car(String model){

		this.model = model;
		speed = 0;
	}
	Car(){
		model = "트럭";
		speed = 0;
		
	}

	// 메서드 정의(기능 , 행위)
	void showPrint() {
		System.out.println("모델명 : "+model);
		System.out.println("스피드 : "+speed);
	}
	
}

public class MainCar {

	public static void main(String[] args) {
		

		
		Car c1 = new Car("페라리",100);
		Car c2 = new Car("람보르기니",80);
		Car c3 = new Car("부가티");
		Car c4 = new Car();
		
		c1.showPrint();
		c2.showPrint();
		c3.showPrint();
		c4.showPrint();
		
		
		

	}

}
