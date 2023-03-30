package day03;

import java.util.Arrays;
import java.util.Objects;

public class MethodQuiz {
    static String[]foods = {"떡볶이","치킨","파스타"};
    static String[]userNames ={"홍길동","김철수"};
    private static void printFoods() {
        System.out.println(Arrays.toString(foods));
    }

    private static void push(String str) {
        String temp[] = new String[foods.length+1];

        for (int i = 0; i < foods.length ; i++) {
            temp[i] = foods[i];
        }
        temp[temp.length-1] = str;

        foods = temp;
        temp = null;
    }

    private static int indexOf(String str) {
        for (int i = 0; i < foods.length; i++) {
            if(str.equals(foods[i])){
                return i;
            }
        }
        return -1;
    }
    private static void remove(String str){
        if (foods.length > 0) {
            // 0. 삭제 대상 데이터 백업
            String delTarget = foods[foods.length - 1];

            // 1. 원본배열보다 1개 사이즈 작은 새 배열 생성
            String[] temp = new  String[foods.length - 1];

            // 2. 맨 마지막 데이터만 빼고 모두 새배열에 복사
            for (int i = 0; i < temp.length; i++) {
                temp[i] = foods[i];
            }
            for (int i = 0; i <temp.length ; i++) {
                if(str.equals(foods[i])){
                    return;
                }else{
                    break;
                }
            } System.out.println("존재하지 않는 음식명입니다!");
            // 3. 주소값 이전
            foods = temp;
            temp = null;
        }
    }


    public static void main(String[] args) {
        printFoods();
        push("라면");
        push("김치찌개");
        printFoods();

        // idx에 2가 리턴되어야 함.
        int idx = indexOf("파스타");
        System.out.println(idx);
        // idx에 4가 리턴되어야 함.
        int idx2 = indexOf("김치찌개");
        System.out.println(idx2);
        // idx에 -1이 리턴되어야 함.
        int idx3 = indexOf("짜장면");
        System.out.println(idx3);

        remove("김치찌개"); // foods배열에서 김치찌개 제거
        //remove("망고"); // 존재하지 않는 음식명입니다 출력.

        printFoods();


//        boolean flag = include("파스타"); // 파스타 발견시 true 리턴
//        boolean flag2 = include("양념치킨"); // 양념치킨 미발견시 false 리턴
//
//        insert(3, "파인애플"); // 3번 인덱스에 파인애플 삽입
//        modify(2, "닭갈비");  // 2번 인덱스 데이터 닭갈비로 수정
//        //clear();  // foods배열 모든 데이터 삭제


    }


}
