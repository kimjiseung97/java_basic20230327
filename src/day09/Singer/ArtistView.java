package day09.Singer;

import day04.array.StringList;
import day08.poly.car.Stinger;

import static day07.Util.Utility.input;
import static day07.Util.Utility.makeLine;

public class ArtistView {

    private final static ArtistRepository ar;

    static {
        ar = new ArtistRepository();
    }

    public static void start(){
        while(true){
            System.out.println("\n\n****** 음악 관리 프로그램 ******");
            System.out.printf("# 현재 등록된 가수: %d명\n", ar.count());
            System.out.println("# 1. 노래 등록하기");
            System.out.println("# 2. 노래 정보 검색");
            System.out.println("# 3. 프로그램 종료");
            makeLine();

            String menuNum = input(">>");
            switch (menuNum){
                case"1":
                    insertProcess();
                    break;
                case"2":
                    searchProcess();
                    break;
                case"3":
                    System.out.println("# 프로그램을 종료합니다.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("# 메뉴를 잘못 입력했습니다!");
            }
        }
    }

    private static void insertProcess() {
        System.out.println("\n# 노래 등록을 시작합니다");
        String artistName = input("- 가수명");
        String songName = input("- 노래명: ");

        //신규 가수인 경우
        if(!ar.isRegistered(artistName)){
            ar.addNewArtist(artistName,songName);
            System.out.printf("\n# %s님이 신규등록되었습니다.\n",artistName);
        }else{
            boolean flag = ar.addNewSong(artistName,songName);
            if(flag){
                System.out.printf("\n# %s님의 노래목록에 %s곡이 추가되었습니다.",artistName, songName);
            }else{
                System.out.printf("\n# [%s]곡은 이미 등록된 노래입니다.\n", songName);
            }
        }
    }
    private static void searchProcess() {
        System.out.println("\n# 검색할 가수명을 입력하세요.");
        String artistName = input("- 가수명: ");

        if(ar.isRegistered(artistName)){
            //등록된 경우
            System.out.printf("\n# %s님의 노래목록 \n", artistName);
            makeLine();
            String[] songList = ar.getSongList(artistName);
            for (int i = 0; i < songList.length; i++) {
                System.out.printf("* %d. %s\n", i+1, songList[i]);
            }
        } else {
            System.out.println("\n# 해당 가수는 등록되지 않았습니다.");
        }
        }
    }

