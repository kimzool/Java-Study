package pack1;

public class ParentTest {
	
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
		Parent p = new Parent();
		p.show();
		
		
		System.out.println("=== 같은 패키치 테스트 ===");
		System.out.println("public a = " + p.a);
		System.out.println("protected b = " + p.b);
		System.out.println("int c = " + p.c);
		//System.out.println("private d = " + p.d); 
		// Parent 클래스에 담겨있는 d 변수는 private 계열로 같은 클래스에서만 작동 가능한 변수이기 때문에 다른 클래스인 ParentTest에서 사용할 수 없다.
		
		System.out.println("\n=== 메서드 호출 ===");
		p.show();
	}

	
	
	
}
