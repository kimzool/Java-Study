package ex04;

// 문자열 함수
import java.util.Scanner;

public class StringFun {
     public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
      
        System.out.print("문자열을 입력하세요: ");
        String str = scanner.nextLine(); // Hello입력
        
        // 1. length() : 문자열 길이
        // .length : 배열 길이, length() : 문자열 길이
        System.out.println("\n=== 1. 기본 정보 ===");
        System.out.println("문자열: " + str); // 문자열 : Hello
        System.out.println("길이: " + str.length()); // 길이 : 5

        // 2. charAt() : 문자 하나씩 접근
        System.out.println("\n=== 2. charAt() ===");
        for (int i = 0; i < str.length(); i++) {
            System.out.println(i + "번째 문자: " + str.charAt(i));
        }
         System.out.println(str.charAt(1)); 

        // 3. toCharArray() : 문자 배열로 변환
        System.out.println("\n=== 3. toCharArray() ===");
        char[] arr = str.toCharArray(); // 문자 배열로 변환
//        for(int j = 0; j < arr.length; j++) {
//        	System.out.println(arr[j]);
//	
//        }
        for (char ch : arr) { // 향상된 for 문
            System.out.println(ch); // arr 배열에서 하나씩 꺼내서 ch 문자 변수에 담는다.
        }
         System.out.println(arr[4]); // o

        // 4. toUpperCase(),toLowerCase() : 대소문자 변환
        System.out.println("\n=== 4. 대소문자 변환 ===");
        System.out.println("대문자: " + str.toUpperCase()); // HELLO
        System.out.println("소문자: " + str.toLowerCase()); // hello

        // 5. indexOf() : 문자열 검색, 문자열의 인덱스 검색
        System.out.println("\n=== 5. 문자열 검색 ==="); // Hello
        System.out.println("Java 포함 여부: " + str.contains("llo")); // true 
         System.out.println("Java 위치: " + str.indexOf("l")); // 2
        System.out.println("Java 위치: " + str.lastIndexOf("l")); // 3
       System.out.println("Java 위치: " + str.indexOf("a")); // 없으면 -1

        // 6. substring() : 부분 문자열 추출
        System.out.println("\n=== 6. substring() ===");
       if (str.length() >= 3) {
            System.out.println("앞 3글자: " + str.substring(0, 2));
            // substring(시작, 끝-1), substring(0,2): 0부터 1까지) //Hello
            System.out.println("2부터 끝까지: " + str.substring(2)); 
            // 2번부터 끝까지
        }

        // 7. replace() : 문자열 변경
        System.out.println("\n=== 7. replace() ===");
        String replaced = str.replace("Hello", "Hi");
        System.out.println("변경 결과: " + replaced);

        // 8. trim() : 앞뒤 공백 제거 ( 중간 공백은 제거하지 않는다. )
        System.out.println("\n=== 8. trim() ===");
        String tr1= "   Hello        Java     "; 
        String tr2 = tr1.trim(); // Hello        Java
        System.out.println("공백 제거: [" + tr2 + "]");


        // 9. split() : 문자열 분리, 구분자를 기준으로 잘라 배열에 저장
        System.out.println("\n=== 9. split() ===");
        String test = "Java,Python,C";
        String[] sarr = test.split(",");

        for (String s : sarr) {
            System.out.println(s);
        }

        // 10. equals(), equalsIgnoreCase() : 문자열 비교
       System.out.println("\n=== 10. 문자열 비교 ===");
        String s1 = "Java";
        String s2 = "JAVA";

        System.out.println("equals 결과: " + s1.equals(s2)); //문자열 내용이 같은지 비교(대소문자 구분) //false
        System.out.println("equalsIgnoreCase 결과: " + s1.equalsIgnoreCase(s2)); //대소문자 구분 없음  //true

        
        // 11. concat() : 문자열 연결
        System.out.println("\n=== 11. 문자열 연결 ===");
        String result = str.concat("  World");
        System.out.println("concat 결과: " + result);
        // Hello World


        // 12. 문자열 ↔ 숫자 변환
        System.out.println("\n=== 12. 문자열 ↔ 숫자 ===");
        String numStr = "100";

        int num = Integer.parseInt(numStr);
        System.out.println("문자열 → 숫자: " + num);

        String backToStr = String.valueOf(num);
        System.out.println("숫자 → 문자열: " + backToStr);

        scanner.close();
    }
}