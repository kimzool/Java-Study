package exceptionex;

import java.util.Scanner;
import java.lang.ArithmeticException;

public class Exception02 {
	
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
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(PURPLE+"<< 나누기 프로그램 >>"+RESET);
		
		System.out.println(GREEN+"정수 1 입력..>>"+RESET);
	
		int a = sc.nextInt();
		System.out.println(GREEN+"정수 2 입력..>>"+RESET);
		int b = sc.nextInt();
		try {
			System.out.println(MINT+"연산 하는중.."+RESET);
			int result = a/b;
			System.out.println(RED+"결과 : "+RESET+BLACK+result);
			
		} catch (ArithmeticException e) { // 객체 변수 e
			System.out.println("0으로는 나눌 수 없습니다.");
			System.out.println("메세지 : "+e.getMessage()); // 에러의 원인 메시지
			
		}
		System.out.println(YELLOW+"프로그램 종료");

	}

}
