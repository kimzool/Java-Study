package javastart;

import java.util.Scanner;



// (             1              )

//설계클래스
class Menu {
	String order;
  // (              2             ) //멤버변수(필드)

   Menu(String order) {  
	   this.order = order;
//      (            3                 ) //생성자 실행
   }

   // 메서드
   void printMenu() {
      System.out.println("\u001B[36m전정우 카페 메뉴는: \u001B[0m" + order);
   }
}



//실행 메서드
public class MainMenu {
	
	  public static final String RED = "\u001B[31m";
	  public static final String GREEN = "\u001B[32m";
	  public static final String BLACK = "\u001B[30m";
	  public static final String YELLOW = "\u001B[33m";
	  public static final String BLUE = "\u001B[34m";
	  public static final String PURPLE = "\u001B[35m";
	  public static final String MINT = "\u001B[36m";
	  public static final String WHITE = "\u001B[37m";
	  
	  public static final String RESET = "\u001B[0m";
	  
	
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
    		 

      // 객체 배열 생성 및 초기화
      Menu[] menuArr = new Menu[3];

      // 첫번째 방법(배열 생성 후 배열 객체에 하나씩 저장)
     // (                5                   ) // Menu 객체를 3개 저장할 수 있는 배열을 만듬
      menuArr[0] = new Menu("Coffee"); // 생성자 호출
      menuArr[1] = new Menu("Tea");
      menuArr[2] = new Menu("Juice");

//         두번째 방법(한번에 초기화)
//         Menu[] menuArr = {
//            new Menu("Coffee"),
//            new Menu("Tea"),
//            new Menu("Juice")
//        };      

//          세번째 방법 (배열 생성-> 메뉴이름배열(데이터)->for문으로 자동 저장)
//          Menu[] menuArr = new Menu[3];
//          String[] names = {"Coffee", "Tea", "Juice"};
//          for(int i = 0; i < menuArr.length; i++) {
//             menuArr[i] = new Menu(names[i]);
//          }

      
     // (         6            )      
      	 while(true){
         System.out.print("\u001B[33m메뉴 번호 입력 (0 입력 시 종료):\u001B[0m");
         int num = sc.nextInt();
        		 //(           7            )
        // (      8       )
         if(num == 0) {
            System.out.println("\u001B[31m프로그램 종료\u001B[0m");
            break;
           // (      9        )
       }

         switch (num) {
         case 1:
        	 menuArr[0].printMenu();
          //  (              10          )
            break;
         case 2:
        	 menuArr[1].printMenu();
            //(              11          )
            break;
         case 3:
        	 menuArr[2].printMenu();
         //   (              12          )

            break;
         default:
            System.out.println("\u001B[31m없는 메뉴입니다.\u001B[0m");
         }
      }

      sc.close();
   }
}