package javastart;

public class Arithmetic1 {

	// main mathod(메서드)
	public static void main(String[] args) {

		int x = 20,y = 10;;
		int res1 = add(x,y); // 메서드 호출
		int res2 = sub(x,y); // 메서드 호출
		
		
		add(x,y);
		
		System.out.printf("res1 = %d, res2 = %d\n",res1,res2);
		
		
	}
	
	// add method(메서드)
	public static int add(int a, int b) {
		// int a,int b : 매개변수
		return a+b; // 반환
		
		
	}
	
	
	// sub method(메서드)
	public static int sub(int c,int d ) {
		return c-d;
	}
	
	

}
