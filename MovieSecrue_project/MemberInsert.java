

import java.sql.*;
import java.util.Scanner;

public class MemberInsert {
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

            System.out.println("[ 영화관 회원 정보 추가 ] ");
            System.out.println("[id]를 입력하세요 : ");
            String inputId = s1.nextLine();
            System.out.println("[password]를 입력하세요 : ");
            String inputPw = s1.nextLine();
            System.out.println("[name]을 입력히세요 : ");
            String inputName = s1.nextLine();
            System.out.println("[Role]을 입력하세요 : ");
            String inputRole = s1.nextLine();

            String sql =
                    "INSERT INTO member (user_id,user_password,m_name,m_role) "
                            + "VALUES(?,?,?,?)";

            PreparedStatement stmt = conn.prepareStatement(sql);

            // 첫번째
            stmt.setString(1,inputId);
            // 두번째
            stmt.setString(2,inputPw);
            //세번째
            stmt.setString(3,inputName);
            // 네번째
            stmt.setString(4,inputRole);

            System.out.println("\n실행한 sql문 : ");
            System.out.println(sql);

            //ResultSet rs = stmt.executeQuery(); select문에만 해당
            int result = stmt.executeUpdate();

            if(result == 1){
                System.out.println("\n회원가입 성공 !");
            }else {
                System.out.println("\n회원가입 실패 !");
            }


        } catch (SQLException e) {
            System.out.println("데이터베이스 오류입니다");

        }


    }
}
