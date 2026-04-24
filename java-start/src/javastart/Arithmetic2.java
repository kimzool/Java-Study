package javastart;

public class Arithmetic2 {

	public static void main(String[] args) {
		
		int i = 20;
		double j = 10.5;
		sum(i,10);
		int res1 = sum(i,10);
		double res2 = sum(i,j);
		
		System.out.println(res1);
		System.out.println(res2);
		

	}
	public static int sum(int a,int b) {
		return a+b;
	}
	
	public static double sum(double x,double y) {
		
		return x+y;
	
	}

}


// 메서드 오버로딩
// -> 같은 이름의 메서드 생성
// -> 매개변수의 타입(형)과 개수 다름

//sum(int a,int b)
//sum(double a, double b) - > 오버로딩 가능
//
//sum(int a, int b)
//sum(int a,int b,int c) -> 오버로딩 가능
//
//sum(int a, double b)
//sum(double a,int b) -> 오버로딩 가능
//
//int sum(int a,int b)
//double sum(int x,int y) -> 오버로딩 불가능

