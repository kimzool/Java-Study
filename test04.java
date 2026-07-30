package test0204;

public class test04 {
    public static void main(String[] args) {
        String[] s1 = {"pass2026","java","Admin123"};

        int count = 0;

        for(String pwd : s1){



            System.out.println("비밀번호: "+pwd);

            System.out.println("비밀번호 길이: "+pwd.length());

            if(pwd.length() >= 6){
                System.out.println("길이 조건 통과");
                count += 1;
            }
            else{
                System.out.println("길이 조건 미통과");
            }

            System.out.println("대문자 변환: "+pwd.toUpperCase());
            System.out.println("소문자 변환: "+pwd.toLowerCase());

            System.out.println("첫 번째 문자: "+pwd.charAt(0));
            System.out.println("마지막 문자: "+pwd.charAt(pwd.length()-1));


            System.out.println();


        } // for String pwd

        System.out.println("길이 조건을 통과한 비밀번호 수: "+count);
    } // main method
}
