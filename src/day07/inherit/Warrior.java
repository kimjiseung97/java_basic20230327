package day07.inherit;


//is a 관계 워리어는 플레이어다 == 참
//서브클래스 (자식클래스)
public class Warrior extends Player{

    int rage; //분노게이지

    public Warrior() {
        this("이름없음");
    }

    public Warrior(String nickName) {
        super(nickName); //자동으로 생성됌 default값
        this.rage = 48;
    }



    //파워 슬래시
    public void powerSlash(){
        System.out.println("파워 슬래시를 시전합니다.");
    }

    //오버라이딩
    //조건 : 부모의 시그니처(리턴타입,이름,파라미터)를 똑같이 사용
    //      접근제한자는 무조건 부모보다 public해야함.
    @Override //오버라이딩 검사
    public void showStatus(){
        super.showStatus();
        System.out.println("# rage :"+this.rage);
    }

}
