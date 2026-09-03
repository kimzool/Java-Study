

import java.sql.*;
import java.util.Scanner;


public class Login {
    public static void main(String[] args) {
        // MySQL 접속 주소
        String url = "jdbc:mysql://localhost:3306/movie_db";
        // MySQL 사용자 계정
        String user = "root";
        // MySQL 비밀번호
        String password = "sql12345";
        Scanner s1 = new Scanner(System.in);

        try{
            Connection conn =
                    DriverManager.getConnection(url,user,password);
            System.out.println("[영화관 회원 로그인]");

            System.out.println("[id] 를 입력하세요 : ");
            String inputId = s1.nextLine();
            System.out.println("[password] 를 입력하세요 : ");
            String inputPw = s1.nextLine();

            // member
            // m_id user_id m_name m_role 조회
            // 조건) user_id가 'hong'
            // user_password 가 '1234'
            String sql =
                    "SELECT m_id,user_id,m_name,m_role " +
                    "FROM member " +
                    "WHERE user_id = '"+ inputId +"' " +
                    "AND user_password = '" +inputPw+"' ";

            System.out.println("\n 실행할 sql문");
            System.out.println(sql);
            // 문장을 sql에 전달
            Statement stmt = conn.createStatement();
            // sql문장을 실행 -> 결과 받기
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()){

                // sql 결과 -> 자바 변수
                String memberName = rs.getString("m_name");
                String memberRole = rs.getString("m_role");

                System.out.println("\n로그인 성공 !");
                System.out.println(memberName+"님 환영합니다.");
                System.out.println("회원권한 : "+memberRole);
            }else {
                System.out.println("아이디나 비밀번호가 다릅니다.");
            }
            rs.close();
            stmt.close();
            conn.close();



        }catch(Exception e){
            System.out.println("데이터베이스 오류입니다");

        } finally{
            s1.close();

        } // finally


    } // main method
} // public class Login

/*
시큐어 코딩(Secure Coding):
프로그램이 정상적으로 작동하게 만드는 것 뿐만 아니라, 잘못된 입력이나 해킹에도
안전하도록 코드를 작성하는 방법

SQL 인젝션(Injection) :
사용자 입력 부분에 SQL 명령이나 SQL 문법을 주입하는 공격
프로그램이 사용자 입력값을 안전하게 처리하지 않고 SQL 문장에 직접 포함할때 , 공격자가 입력값에 SQL 문법을
넣어 원래 SQl 문의 구조나 실행 조건을 변경하는 공격
 */

