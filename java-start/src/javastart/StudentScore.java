package javastart;

import java.util.Scanner;

class StudentP{
	
	String name;
	int score;
	
	
	StudentP(String name,int score){
		this.name = name;
		this.score = score;
	}
}


public class StudentScore {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// 학생 수 키보드로 부터 입력
		System.out.println("학생 수가 몇명인가요?..>>");
		int cnt = sc.nextInt(); // 학생 수 만큼 배열을 생성하기 위해서
		sc.nextLine();
		
		StudentP[] s = new StudentP[cnt];
		
		// 반복문을 통해서 배열 요소 객체 생성
		// 값을 키보드로부터 입력받음
		for(int i = 0; i < s.length;i++) {
		System.out.println((i+1)+"번째 학생의 이름을 입력하세요..>>");
	
		String name = sc.nextLine();
		System.out.println((i+1)+"번째 학생의 점수를 입력하세요..>>");
		int score = sc.nextInt();
		sc.nextLine();
		s[i] = new StudentP(name,score);
		}
		
		
		for(int i =0; i < s.length; i++) {
			System.out.println("학생의 수 : "+cnt+ "명 " +"학생 : "+s[i].name+" 학생 점수 : "+s[i].score );
		}
		
		// 이름 검색
		while(true) {
			System.out.println("검색할 이름을 입력하세요..>>");
			String sname = sc.nextLine();
			
		
			
			boolean found = false; // 일치하는 이름이 없을때의 변수 boolean found 생성
			
			for(int j = 0; j < s.length; j++) { 
				if(s[j].name.equals(sname)) { // s[j].name , 즉 s.name의 j번째 배열에 있는 이름이 sname으로 스캐너로 입력받은 변수와 같으면
					System.out.println((j+1)+"번째 학생 이름 일치 ");
					System.out.println("학생 : "+s[j].name+" 학생 점수 : "+s[j].score );
					found = true; // boolean found 변수를 true로 변경
					break;
				} // if
				else if(!s[j].name.equals(sname)){ // s[j].name , 즉 s.name의 j번째 배열에 있는 이름이 sname으로 스캐너로 입력받은 변수와 같지 않으면
				System.out.println((j+1)+"번째 학생 이름 불일치 ");
				
					
				} // else if
			} // for
		
			if(!found) {
				
				System.out.println("일치하는 이름이 없습니다.");
				
			} // if
			System.out.println("그만하시겠습니까? ( yes or no )"); // 중단할것인가 묻는 println
			String yesno = sc.nextLine(); // 스캐너
			
			if (yesno.equals("yes")) { // 만약 "yes"라 치면 시스템을 종료
				System.out.println("시스템을 종료합니다.");
				break;
			} // if
			else if (yesno.equals("no")) { // 만약 스캐너에 "no"라고 치면 시스템을 계속
				System.out.println("시스템을 계속합니다.");
			} // else if
			else {
				
			} // else
			
		} // while
		
		
	
	} // main
} // public class StudentScore
