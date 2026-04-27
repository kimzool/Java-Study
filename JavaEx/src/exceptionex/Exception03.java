package exceptionex;




public class Exception03 {

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
		try {
			
			int[] a = {1,2};		
			System.out.println(a[5]); // 에러
			
			String str = null;
			System.out.println(str.length()); // 에러
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스 범위를 벗어남");
		} catch (NullPointerException e) {
			System.out.println("Null 레퍼런스 참조 에러");
		} catch (Exception e) { // Exception : 모든 예외일때, 항상 마지막에 사용해야함.
			System.out.println("기타 에러.");
		}
		// catch 문장이 여러개 나올시 첫번째에 해당하는 catch만 수행한다.
	}

}
