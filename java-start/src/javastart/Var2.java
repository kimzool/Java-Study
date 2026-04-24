package javastart;

public class Var2 {

	public static void main(String[] args) {
		
		//var : 자동으로 변수의 타입(형) 을 결정해준다. 초기값을 보고 판단
		
		var x = 5;
		System.out.println(x++ + ++x);
		// 왼쪽 x : 5 -> 후위연산  - > x : 6 - > ++x 전위연산  - > x : 7
		// 5 + 7 = 12
		System.out.println(2*1500+300+"hello");
		var k = 30.5;
		var y = 12.3f;
		var n = "java";
		System.out.printf(x + "" + k + "" + y + "" + n);
		
	}

}
