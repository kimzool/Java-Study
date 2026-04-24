package javastart;

public class Var1 {

	public static void main(String[] args) {
		int  a = 100; // 정수 (4바이트)
		long l = 10000000000L; // 정수 (8바이트) 값에 L 붙임
		float f = 10.5f; // 실수(4바이트) , 값에 f 붙임
		double b = 10.5; // 실수 (8바이트)
		boolean c = true;
		//부울린(boolean) true , false 입력 가능, 1바이트
		char d = 'A'; // 문자 하나 문자 하나가 2바이트
		String e = "Hello Java";
		//문자열 , 문자열을 다루기 위한 특별한 타입
		

		System.out.println(a);
		System.out.println(l);
		System.out.println(f);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(a+"\n"+l+"\n"+f+"\n");
		System.out.printf("%d %d %.1f %.1f %c %s ",a,l,f,b,c,d);
		
		
		
		
	}

}
