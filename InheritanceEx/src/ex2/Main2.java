package ex2;

public class Main2 {

	public static void main(String[] args) {
		Dog2 d1 = new Dog2();
		
		d1.move(); // 자식의 메서드 수행
		d1.sound();
		
		Animal2 a = new Animal2();
		a.sound();
		a.move();

	}

}
