package ex2;

public class Dog2 extends Animal2 {
	
	
	@Override
	public void sound() { // Override : 자식이 부모와 동일한 메서드를 재정의
		// 상속시 가능
		System.out.println("강아지가 멍멍 짖습니다.");
	}
	
	@Override
	public void move() {
		System.out.println("강아지가 네발로 움직입니다.");
	}

}
