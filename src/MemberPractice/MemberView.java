package MemberPractice;

import java.util.Locale;
import java.util.Scanner;

//역할 회원관리 앱의 입출력을 담당
public class MemberView {

    Scanner sc;
    MemberRepository mr;

    public MemberView() {
        this.sc = new Scanner(System.in);
        this.mr = new MemberRepository();

    }

    /*
    * 초기 메인 화면을 출력
    * */
    void mainView(){

            System.out.println("\n###### 회원 관리 시스템 #######");
            System.out.println("*1 회원정보 등록하기");
            System.out.println("*2 개별회원정보 조회하기");
            System.out.println("*3 전체회원정보 조회하기");
            System.out.println("*4 회원정보 수정하기");
            System.out.println("*5 회원정보 삭제하기");
            System.out.println("*6 프로그램 끝내기");
            System.out.println("==============================");

    }
    /*
     * 프로그램 화면 흐름을 제어하는 기능*/
    void viewProcess(){
        while (true) {
            mainView();
            String menuNum = input(">>");

            switch(menuNum){
                case "1":
                    signUp();
                    break;
                case "2":
                    break;
                case "3":
                    mr.showMembers();
                    stop();
                    break;
                case "4":
                    changePasswordViewProcess();
                    break;
                case "5":
                    break;
                case "6":
                    String answer = input("# 정말로 종료합니까? [y/n]");
                    if(answer.toLowerCase().charAt(0)=='y'){
                        System.out.println("프로그램을 종료합니다");
                        System.exit(0);
                    }else{
                        continue;
                    }
                    break;
                default:
                    System.out.println("\n메뉴 번호를 다시 입력하세요");
            }
        }
    }

    void changePasswordViewProcess() {
        String email = input("# 수정할 멤버의 이메일 : ");
        Member foundMember = mr.findByEmail(email);
        if(foundMember!=null){
            //존재하는 사람인지 확인했으니 변경작업진행

        }
    }

    String input(String message){
        System.out.print(message);
        return sc.nextLine();
    }

    //엔터를 누르기전까지 멈추는 기능
    void stop(){
        System.out.println("\n=============엔터를 눌러서 계속 ==============");
        sc.nextLine();
    }

    //회원등록 입력 처리

    void signUp(){
        System.out.println("\n회원 등록을 시작합니다 !!");
        String email;
        while (true) {
            email = input("# 이메일 : ");
            if(!mr.isPuplicateEmail(email)){
                break;
            }else{
                System.out.println("이메일이 중복되었습니다");
            }
        }
        String name = input("# 이름 : ");
        String password = input("# 패스워드 : ");
        Gender gender;
        checkGender : while (true) {
            String inputGender = input("# 성별[m/f]");
            switch (inputGender.toUpperCase().charAt(0)){
                case 'M':
                    gender = Gender.MALE;
                    break  checkGender;
                case 'F':
                    gender = Gender.FEMALE;
                    break  checkGender;
                default:
                    System.out.println(" #성별을 올바르게 입력해주세요");
            }
        }

        int age = Integer.parseInt(input("# 나이 : "));

        //실제 저장 명령
        Member newMember = new Member(email,password,name,mr.getLastMemberId()+1,gender,age);

        mr.addMember(newMember);

        System.out.println("\n# 회원 가입 성공!");
        stop();


    }
}
