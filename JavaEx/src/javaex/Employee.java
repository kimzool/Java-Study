package javaex;

public class Employee {
	
	private String name;
	private int no; // 사번
	private int pay;
	
	public Employee(String name,int no,int pay) {
		this.name = name;
		this.no = no;
		this.pay = pay;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		// this.name = name;
		System.out.println("이름은 수정할 수 없습니다.");
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		// this.no = no;
		System.out.println("사번은 수정할 수 없습니다.");
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		
		if(pay < 2200000) {
			System.out.println("최저임금미만입니다. 확인해보세요.");
		} else {
			
			System.out.println("급여를 수정합니다.");
			this.pay = pay;
		}
		
		
	}
	
	
	public void print() {
		System.out.println("이름 : "+name+" 사번 : "+no+"  급여 : "+pay);
	}

}
