package staticex;

// static 변수는 " 클래스가 메모리에 로딩될 때 " 생성
// 모든 객체가 공유
// 객체 없이 사용 가능

class Counter2{ // 클래스 Counter2 생성
	static int cnt = 0; // static 변수 정수 cnt의 값은 0이다.
	
	
	static void increase() { // static 메서드 increase(); 생성
		cnt++; // 정수 변수 cnt 후위연산
	}
}

public class StaticTest2 {

	public static void main(String[] args) {
		
		// static 클래스 때문에 객체를 생성하지 않아도 불러올수 있다
		
		Counter2.increase(); // Counter2 클래스의 메서드 increase(); 불러오기 11
		Counter2.increase(); // Counter2 클래스의 메서드 increase(); 불러오기 22
		
		System.out.println("cnt : "+Counter2.cnt); // Counter2 클래스의 정수 변수 cnt의 값 불러오기
		

	}

}
