package BookPractice;

import MemberPractice.Gender;
import day07.Util.Utility;
import day08.poly.car.Stinger;

import java.util.Scanner;

import static day07.Util.Utility.*;

public class LibraryView {

    private static Scanner sc;

    private static LibraryRepository repository;


    //static 필드의 초기화는 static initializer를 사용
    static {
        sc = new Scanner(System.in);
        repository = new LibraryRepository();
    }

    //회원정보 입력처리
    private static void makeNewBookUser(){
        System.out.println("\n# 회원 정보를 입력해주세요");
        String name = input("# 이름 : ");
        int age = Integer.parseInt(input("#나이 : "));
        Gender gender = inputGender();

        //입력받은 데이터 객체로 포장
        BookUser userInfo = new BookUser();
        userInfo.setName(name);
        userInfo.setAge(age);
        userInfo.setGender(gender);

        //입력받은 유저 객체를 저장소로 보내기
        repository.register(userInfo);

    }

    private static Gender inputGender() {
        while (true) {
            String inputGender = input("#성별 :[m/f] ");
            Gender gender;
            switch (inputGender.toUpperCase().charAt(0)){
                case'M':
                    return Gender.MALE;
                case'F':
                    return Gender.FEMALE;
                default:
                    System.out.println("성별을 제대로 입력해주세요");
            }
        }
    }


    //화면처리
    public static void start(){
        makeNewBookUser();
        //메인 메뉴띄우기
        while (true){
            showMainScreen();
            selectMenu();
        }
    }

    //메뉴번호입력받고 분기나눠주는 메서드
    private static void selectMenu() {
        String menuNum = input("메뉴 번호 :");
        switch (menuNum){
            case "1":
                BookUser user =repository.findBookUser();
                System.out.println("\n===============회원님 정보=============");
                System.out.println("회원명 : "+user.getName());
                System.out.println("나이 : "+user.getAge());
                System.out.println("성별 : "+user.getGenderToString());
                System.out.println("쿠폰개수 : "+user.getCouponCount());
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                break;
            case "9":
                System.out.println("프로그램을 종료합니다!!");
                System.exit(0);
                break;
            default:
                System.out.println("다시 입력해주세요!");
        }
    }

    //메인 메뉴창을 출력하는 메서드
    private static void showMainScreen() {
        System.out.println("\n==============도서 메뉴=================");
        System.out.println("# 1 마이페이지");
        System.out.println("# 2 도서 전체 조회");
        System.out.println("# 3 도서 검색");
        System.out.println("# 4 도서 대여하기");
        System.out.println("# 9 프로그램 종료하기");
    }


}
