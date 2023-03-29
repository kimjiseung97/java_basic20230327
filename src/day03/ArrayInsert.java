package day03;

import java.util.Arrays;

public class ArrayInsert {
    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50};

        int targetIndex = 2;
        //20이랑 30사이에 넣고싶음
        int newData = 25; // 2번 인덱스에 넣어야함

        //1. 배열의 사이즈를 먼저 1 늘린다
        int[]temp = new int[arr.length+1];
        System.out.println(arr.length);
        //2. 원본배열을 전부 복사해놓는다
        for (int i = 0; i <arr.length ; i++)
            temp[i] = arr[i];
//        System.out.println(temp.length);
        //3. 맨 뒤부터 타겟인덱스까지 한칸씩 뒤로 민다.
        for (int i = temp.length-1; i>targetIndex ; i--) {
            temp[i] = temp[i-1];
        }
        //4. 타겟인덱스자리에 새 데이터를 넣는다
        temp[targetIndex] = newData;
        //5. 주소를 바꾼다.
        arr= temp;
        temp = null;
        System.out.println(Arrays.toString(arr));


    }
}
