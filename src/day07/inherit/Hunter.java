package day07.inherit;

public class Hunter extends Player{

    int concentration; //집중력

    public Hunter(String nickName) {
       super(nickName);
       this.concentration = 38;
    }


    //캐릭터 상태창을 보는 기능


    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("# concentrate :"+this.concentration);
    }
}
