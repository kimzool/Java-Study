package exceptionex;

import java.util.InputMismatchException;
import java.util.Scanner;




public class Exception01 {
	
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
		
		System.out.println("정수를 입력하세요..>>");
		
		try {
			int n = sc.nextInt();
			if(n % 2 == 0) {
				System.out.println("짝수입니다");
			}
			else {
				System.out.println("홀수입니다.");
			}
			
			
		} catch (InputMismatchException e) { // 정수를 입력해야하는데 정수가 아닌것을 입력해서 예외상황 발생
			System.out.println("다시 입력해주세요.");
			
		}
		finally { // 예외 여부 관계없이 항상 수행
			System.out.println("프로그램 종료");
			sc.close();
			
		}

	}

}
