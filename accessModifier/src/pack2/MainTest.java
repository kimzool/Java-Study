package pack2;

import pack1.Parent; // 패키지 pack1에 있는 클래스 Parent를 불러오기

public class MainTest { // public class 는 어느곳에서나 객체 생성이 가능하다
	// 하지만 다른 경우에는 import를 해야한다.
	
	  public static final String RED = "\u001B[31m"; // 쓸모없는 색깔코드
	  public static final String GREEN = "\u001B[32m";// 쓸모없는 색깔코드
	  public static final String BLACK = "\u001B[30m";// 쓸모없는 색깔코드
	  public static final String YELLOW = "\u001B[33m";// 쓸모없는 색깔코드
	  public static final String BLUE = "\u001B[34m";// 쓸모없는 색깔코드
	  public static final String PURPLE = "\u001B[35m";// 쓸모없는 색깔코드
	  public static final String MINT = "\u001B[36m";// 쓸모없는 색깔코드
	  public static final String WHITE = "\u001B[37m";// 쓸모없는 색깔코드
	  
	  public static final String RESET = "\u001B[0m";// 쓸모없는 색깔코드

	public static void main(String[] args) {
		Child ch = new Child();
		Parent pa = new Parent();
		
		System.out.println(MINT+"=== 일반 객체 ==="+RESET);
		
		System.out.println(RED+"public a = "+PURPLE+pa.a+RESET);
	//	System.out.println(BLUE+"protected b = "+PURPLE+pa.b+RESET);
	//	System.out.println(YELLOW+"default c = "+PURPLE +pa.c+RESET);
	//	System.out.println(GREEN+"private d = "+PURPLE+pa.d+RESET);
		
		// 자식 클래스 접근
		ch.printChild();

	}

}
