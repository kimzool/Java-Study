

import java.sql.*;
import java.util.Scanner;

public class SecureLogin {
    public static void main(String[] args) {
        // MySQL 접속 주소
        String url = "jdbc:mysql://localhost:3306/movie_db";
        // MySQL 사용자 계정
        String user = "root";
        // MySQL 비밀번호
        String password = "sql12345";
        Scanner s1 = new Scanner(System.in);

        try {
            Connection conn =
                    DriverManager.getConnection(url, user, password);

            System.out.println("[ 영화관 회원 로그인 ]");
            System.out.println("[id] 를 입력하세요 : ");
            String inputId = s1.nextLine();
            System.out.println("[password] 를 입력하세요 : ");
            String inputPw = s1.nextLine();
            String sql =
                    "SELECT m_id,user_id,m_name,m_role "
                    +"FROM member "
                    +"WHERE user_id = ? "
                    +"AND user_password = ? ";
            PreparedStatement stmt = conn.prepareStatement(sql);

            // 첫번째
            stmt.setString(1,inputId);

            // 두번째
            stmt.setString(2,inputPw);
            System.out.println("\n실행한 sql문");
            System.out.println(sql);
            ResultSet rs = stmt.executeQuery();

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

        } catch (SQLException e) {
            System.out.println("데이터베이스 오류입니다");

        }finally{
            s1.close();
            System.out.println("=== 최신 SecureLogin 실행중 ===");

        } // finally

    } // main method
} // public class Login
