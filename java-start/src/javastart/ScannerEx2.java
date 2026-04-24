package javastart;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		



		
		System.out.println("가격 입력...>>");
		
		int price = sc.nextInt();
		
		System.out.println("수량 입력...>>");
		double quan = sc.nextDouble();
		
		System.out.println("상품명 입력..>>");
		sc.nextLine();
		String pro = sc.nextLine();
		// 문자열 입력 -> 숫자 입력 -> 문제없음
		// 숫자 입력 -> 문자열 입력 -> 엔터키가 받아져 문자열 입력이 넘어가버림. 엔터키 상쇄 필요
		// sc.nextLine(); 
		

		System.out.println("당신은 회원이십니까? (true/false)");
		boolean mem = sc.nextBoolean();
		
		// 총금액 (tot) : 수량 * 가격
		int tot = (int)quan * price;
		int salee = 0;
		
		// 할인 적용 : 만약 회원이면 10% 할인
		if(mem) {
		System.out.println("회원이시니 10% 할인을 적용합니다..\n");
		int sale = price / 10;
		salee = price - sale;
		}
		else {
			
		}
		
		if ( mem ) { // boolean 이면 mem == true 이것도 맞지만
			// if(mem)을 하면 mem == true 랑 똑같음
			// 만약 false를 원한다면 if(!mem) 을 해야함
		System.out.println("상품명:"+pro);
		System.out.println("가격:"+price);
		System.out.println("수량:"+quan);
		System.out.println("총 가격 : "+tot);
		System.out.println("할인가 : 개당 "+salee);
		System.out.println("회원 여부:"+mem);
		
		
		}
		else {
			System.out.println("당신은 회원이 아닙니다. 이용하실 수 없습니다.");
		}
		
		
		
	}

}
