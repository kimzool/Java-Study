package test;

class Book{
	String title;
	
	Book(String title){
		this.title = title;
	}
}

public class Ex05 {

	public static void main(String[] args) {
		
		Book[] b1 = new Book[3];
		
		b1[0] = new Book("노인과바다");
		b1[1] = new Book("폭풍의언덕");
		b1[2] = new Book("돈키호테");
		
		for(int i = 0;i < b1.length;i++) {
			
		}
	}

}
