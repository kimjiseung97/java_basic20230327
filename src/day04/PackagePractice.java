package day04;

//import fruit.Banana; //임포트는 패키지구문믿에 클래스 바깥에 작성해주어야한다.
//import fruit.Grape;

import fruit.*;

import java.util.Scanner;

public class PackagePractice {
    public static void main(String[] args) {

        new fruit.Apple(); //어느 패키지에있는 무슨 생성자인지 명시를 해주어야함

        Banana banana = new Banana();
        new Grape();
        new day04.Dancer(); //원래는 쓰는게맞지만 같은 패키지이기때문에 생략이 가능한 것

        Scanner sc = new Scanner(System.in);
    }
}
