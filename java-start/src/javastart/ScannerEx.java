package javastart;

import java.util.Scanner; // java.util : 패키치 Scanner : 클래스

public class ScannerEx {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 객체 생성
		// Scanner : 클래스 이름
		// System.in : 키보드로 입력
		// Scanner sc -> Scanner( 클래스 , 타입 ) , sc -> 참조변수

		System.out.println("이름 입력");
		String name = sc.nextLine();
		
		System.out.println("주소 입력");
		String addr = sc.nextLine();
		
		System.out.println("나이 입력");
		int age = sc.nextInt();
		
		System.out.println("체중 입력");
		double weight = sc.nextDouble();
		
		System.out.println("결혼 여부 ( true / false ) 입력");
		boolean married = sc.nextBoolean();
	
		
		System.out.printf("당신의 이름 : %s \n  당신의 주소 : %s \n 당신의 나이 : %d \n당신의 체중 : %1.f\n결혼 여부 : %b",name,addr,age,weight,married);
		
		sc.close(); // 입력도구 종료 , 자원정리
		
	}

}
