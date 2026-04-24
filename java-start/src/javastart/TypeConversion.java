package javastart;

public class TypeConversion {

	public static void main(String[] args) {
		
		
		byte b= 127; // 1바이트 정수 -128 ~ 127
		int i = 100;
		System.out.println(b+i); // 227
		// b가 int 타입으로 자동 변환
		System.out.println(10/4); // 2 정수 나누기 정수 = 정수 2.5가 아님.
		System.out.println(10.0/4); // 2.5 실수 나누기 정수 = 값이 실수로 나옴.
		// 4가 4.0으로 자동 변환
		System.out.println((byte)(b+i)); // 227 - > -29
		// 1바이트는 8비트 - 128 ~ 127
		// 4바이트 -> 1아티ㅡ 오버플로우 발생 -> 원하지않은 답이 나옴
		System.out.println((int)2.9 + 1.8); // 3.8
		System.out.println((int)(2.9 + 1.8)); // 4
		System.out.println((int)2.9 + (int)1.8); // 3
		System.out.println((double)10 / 4); // 2.5
		// 10 -> 실수 -> 10.0 10.0/4 -> 실수/정수 -> 4=>4.0
		int a = 10;
		double result = a + 3.5; // 13.5
		System.out.println(result);
		
		System.out.println("\u001B[31m빨간색 출력\u001B[0m");
		
		
	}

}
