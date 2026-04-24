package test01;

class Laptop {
	public int price;
	
	public Laptop(int price) {
		this.price = price;
	}
}

public class Test01JJW {

	public static void main(String[] args) {
		
		Laptop[] list = new Laptop[2];
		
		list[0] = new Laptop(100000);
		list[1] = new Laptop(1800000);
		
		for(int i = 0; i < list.length; i++) {
			if(list[i].price >= 1500000) {
				System.out.println((i+1)+"번 장비는 고가 장비입니다.");
			}
			
		}
		

	}

}
