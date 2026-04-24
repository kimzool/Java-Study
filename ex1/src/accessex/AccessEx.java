package accessex;

class Sample{
	public int a;
	private int b;
	int c; // 디폴트 접근
	
	void show() {
		System.out.println("a의 값 : "+a);
		System.out.println("b의 값 : "+b);
		System.out.println("c의 값 : "+c);
	}
}

public class AccessEx {
	
	public static void main(String[] args) {
		
		Sample sample = new Sample();
		sample.a = 10;
		//sample.b = 10; // private int b 는 같은 클래스 내에서만 사용할 수 있기 때문에  다른 클래스인 AccessEx에서는 사용할 수 없다.
		sample.c = 10;

		sample.show();
	}

}
