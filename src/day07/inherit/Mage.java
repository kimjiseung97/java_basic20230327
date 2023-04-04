package day07.inherit;

public class Mage extends Player{


    int mana; //마력 게이지

    public Mage(String nickName) {
        super(nickName);
        this.mana = 100;
    }


    //썬더볼트
    @Override //오버라이딩 검사
    public void showStatus(){
        super.showStatus();
        System.out.println("# mana :"+this.mana);
    }
}
