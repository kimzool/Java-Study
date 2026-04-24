package javastart;

import java.util.Scanner; // Scanner 클래스 불러오기
// 단축키 : ctrl + shift + o

public class ConvertType {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in); // 키보드로 입력하기위한 객체 생성
		// import java.util.Scanner; 필요
		
		// 문자열 입력
		System.out.println("숫자를 문자로 입력하세요..>>");
		String ab = s1.nextLine(); // nextLine();는 문자열 1줄로 입력받음.
		
		// 문자열 -> 숫자 변환
		int num = Integer.parseInt(ab); // ab(문자) -> num(정수)
		// Integer(정수) : Wrapper class (래퍼클래스)
		// Wrapper class : 기본형을 객체로 감싸는 클래스
		// Integer.parseInt(a) : 문자 -> 정수 변환
	
		// 숫자 -> 문자열 변환
		String s2 = Integer.toString(num); // toString (문자로 변환)
		// toString 앞에 타입 이정
		String s3 = String.valueOf(num); // valueOf (문자로 변환)
		// valueOf : 타입 관계없음
	
		// 출력
		System.out.println("입력 문자열 :"+ab);
		System.out.println("숫자로 변환 :"+num);
		System.out.println("다시 문자열로 변환(toString) :"+s2);
		System.out.println("다시 문자열로 변환(valueOf) :"+s3);
		
		
		

		
		s1.close();
	}

}
