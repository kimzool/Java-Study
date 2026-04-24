package ex1;

public class Main {

   public static void main(String[] args) {
      Dog d = new Dog();
      
      System.out.println("부모 멤버 사용");
      d.name = "전땅콩";
      d.age = 3;
      d.color = "흰색";
      
      System.out.println("이름 : "+d.name+" 나이 : "+d.age+" 털색 : "+d.color);
      
      // 부모
      d.eat();
      d.sleep();
      
      // 자식 클래스 메서드 호출
      d.bark();
      d.run();
      // d.show();

   }

}
