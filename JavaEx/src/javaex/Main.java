package javaex;

public class Main {

	public static void main(String[] args) {
		Employee e1 = new Employee("홍길동",201,3500000);
		
		e1.print();
		
		e1.setName("이순신");
		e1.setNo(205);
		e1.setPay(5000000);
		
		System.out.println("수정 정보");
		e1.print();


	}

}
