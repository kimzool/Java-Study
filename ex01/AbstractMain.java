package ex01;

abstract class Company{
    String name;


    Company(String name){
        this.name = name;
    }
    void start(){
        System.out.println(name + "님이 출근하였습니다.");
    }
    void end(){
        System.out.println(name + "님이 퇴근하였습니다.");
    }
    // 직무마다 다른 기능
    abstract void work(); // 추상메서드 : 내용구현이 없음
    // 미완성 , 자식들이 반드시 메서드 완성해야함 ( 강제성 )
    // 일하는 기능 - 직무마다 하는일이 다름
}

class Dev extends Company {
    Dev(String name) {
        super(name); // 부모 생성자 호출
    }

    @Override
    void work() {
        System.out.println(name + "님이 프로그램을 개발합니다");
    }
}//1
class Design extends Company{
        Design(String name){
            super(name);
        }
    @Override
    void work(){
        System.out.println(name+"님이 디자인을합니다");
    }
        }//2

class Planner extends Company{
    Planner(String name){
        super(name);
    }
    @Override
    void work(){
        System.out.println(name+"님이 계획을 짭니다.");
    }
}//3




public class AbstractMain {
    static void main(String[] args) {

        Company c1 = new Dev("김지후");
        Company c2 = new Design("윤태원");
        Company c3 = new Planner("김주형");

        c1.start();
        c1.work();
        c1.end();
        System.out.println();

        c2.start();
        c2.work();
        c2.end();
        System.out.println();

        c3.start();
        c3.work();
        c3.end();


    }
}
