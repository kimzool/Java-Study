package pack2;

import pack1.Parent;

public class Child extends Parent{ // Parent 에서부터 상속받음

	public void printChild() { // 설계도의 메서드는 호출해야 실행
		
		System.out.println("=== 자식 클래스 접근 ===");
		System.out.println("public a = " +a);
		System.out.println("protected b = " +b);
		//System.out.println("default c = " +c); !! 오류 !!
		// default는 같은 패키지에서만 사용할 수 있기 때문에 다른패키지로부터 상속을 받아서 사용할 수 없다.
		//System.out.println("private d = " +d); !! 오류 !!
		// private는 같은 클래스 내에서만 사용할 수 있기 때문에 아무리 상속을 받아도 사용할 수 없다.
	}
}