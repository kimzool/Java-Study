package pack1;

public class Parent {
	
	  public static final String RED = "\u001B[31m"; // 쓸모없는 색깔코드
	  public static final String GREEN = "\u001B[32m";// 쓸모없는 색깔코드
	  public static final String BLACK = "\u001B[30m";// 쓸모없는 색깔코드
	  public static final String YELLOW = "\u001B[33m";// 쓸모없는 색깔코드
	  public static final String BLUE = "\u001B[34m";// 쓸모없는 색깔코드
	  public static final String PURPLE = "\u001B[35m";// 쓸모없는 색깔코드
	  public static final String MINT = "\u001B[36m";// 쓸모없는 색깔코드
	  public static final String WHITE = "\u001B[37m";// 쓸모없는 색깔코드
	  
	  public static final String RESET = "\u001B[0m";// 쓸모없는 색깔코드

	
	  //System.out.println("=== 같은 패키지 테스트 ==="); // 오류 이유 : 메서드 안에 담기지 않아서
	  public int a = 10;
	  protected int b = 20;
	  int c = 30; // default
	  private int d = 40;
	  
	  public void show() { 
		  // 이 메서드는 같은 클래스 내에서 생성한 메서드 이기 때문에 다른 클래스인 ParentTest에서 호출하고 사용하면 사용 가능하다.
		  System.out.println("Parent 메서드 실행");
		  System.out.println("a = "+ a);
		  System.out.println("b = "+ b);
		  System.out.println("c = "+ c);
		  System.out.println("d = "+ d); // 같은 클래스
		  
	  }
	  
	  
	  public static void main(String[] args) {
		
		  
		  
	}
	  
	  class haha{
		
	  }
}
