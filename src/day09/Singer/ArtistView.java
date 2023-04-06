package day09.Singer;

import day04.array.StringList;
import day08.poly.car.Stinger;

import static day07.Util.Utility.input;
import static day07.Util.Utility.makeLine;

public class ArtistView {

    private  static AritistRepository ar;

    private static Artist at;

    private static StringList stringList;


    public void showmenu(){
        selectMenu();
    }

    private void selectMenu() {
        while (true) {
            System.out.println("음악관리 프로그램");
            System.out.println("#1. 노래 등록하기");
            System.out.println("#2. 노래 정보 검색");
            System.out.println("#3. 프로그램종료");
            makeLine();
            String select = input(">>");
            switch (select){
                case "1":
                    insertprocess();
                    break;
                case"2" :
                    searchprocess();
                    break;
                case"3":
                    System.out.println("프로그램을 종료합니다");
                    System.exit(0);
                default:
                    System.out.println("올바른 메뉴룰 입력해주세요");
            }
        }

    }

    //1번 메뉴 기능
    private void searchprocess() {
        System.out.println("노래 등록을 시작합니다");
        String artistName=  input("가수명 : ");
        String songName = input("노래명 : ");

        //신규 가수인가?
        if(!ar.isRegistered(artistName)){
           ar.addNewArtist(artistName,songName);
            System.out.printf("\n %s님이 신규 등록되었습니다\n",artistName);
        }else{//기존 가수인 경우
            boolean flag = ar.addNewSong(artistName,songName);
        }
    }

    private void insertprocess() {

    }
}
