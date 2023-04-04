package day07.Util;

import java.util.Scanner;

public class Utility {

    private static Scanner sc = new Scanner(System.in);
    //구분선을 출력하는 기능

    private Utility(){}
    public static void makeLine(){
        System.out.println("============================");
    }

    //문자열을 입력받는 기능
    public static String input(String message){
        System.out.print(message);
        return sc.nextLine();
    }
}
