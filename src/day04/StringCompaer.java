package day04;

import java.util.Scanner;

public class StringCompaer {
    public static void main(String[] args) {

       Scanner sc=  new Scanner(System.in);

       String myName = "홍길동";
       String inputName = sc.nextLine();
        System.out.println("myName = " + myName);
        System.out.println("inputName = " + inputName);
    //String은 객체타입이기때문에 주소값으로 비교를한다 그렇기때문에 미리정의된 equals 함수로 비교해야한다.
        // 일일히 검사하기에는 너무 복잡하기때문!
       if(myName.equals(inputName)){
           System.out.println("두 이름이 일치함!");
       }else{
           System.out.println("두 이름이 일치하지 않음!");
       }

    }
}
