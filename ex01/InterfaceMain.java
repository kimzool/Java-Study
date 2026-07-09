package ex01;

interface Login{
    void login();
    void logout();
}

interface Print{
    void printinfo();
}

class Student implements Login, Print{
    @Override
    public void login(){
        System.out.println("학생 계정으로 로그인했습니다.");
    }
    @Override
    public void logout(){
        System.out.println("로그아웃 하였습니다.");
    }
    @Override
    public void printinfo(){
        System.out.println("사용자 정보 : ");
    }
}
class Teacher implements Login,Print{
    @Override
    public void login(){
        System.out.println("선생님 계정으로 로그인했습니다");
    }
    @Override
    public void logout(){
        System.out.println("로그아웃 하였습니다.");
    }
    @Override
    public void printinfo() {
        System.out.println("사용자 정보 : ");
    }
}

public class InterfaceMain {
    public static void main(String[] args){

        // Login 타입
        Login t1 = new Teacher();
        t1.login();
        t1.logout();

        // Print 타입
        Print p1 = new Teacher();
        p1.printinfo(); // Print 인터페이스 오버라이드

    }
}