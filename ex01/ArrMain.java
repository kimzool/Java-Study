package ex01;

import java.util.ArrayList;

public class ArrMain {
    static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("홍길동"); // String ArrayList 참조변수 names에 String "홍길동" 추가
        names.add("김철수");
        names.add("이영희");

        System.out.println("전체 목록 : "+ names);
        System.out.println("첫 번째 이름 : "+ names.get(0)); // 배열의 위치에 대한 값 불러오기

        names.set(1,"권율");
        System.out.println("변경 후 : "+names); // 배열의 위치 1에 대한 값을 "권율"로 변경
        names.remove(2);
        System.out.println("삭제 후 :"+ names);
        System.out.println("저장된 개수 : "+names.size());
    }
}
