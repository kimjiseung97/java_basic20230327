package day06.encap;

public class Main {
    public static void main(String[] args) {

        Car myCar = new Car("그랜저");

        myCar.setSpeed(500);

        System.out.println(myCar.getSpeed());

        myCar.setMode('A');
        System.out.println(myCar.getMode());

        myCar.pressButton(); //순서가 바뀌면 안되는 기능들을 private로 만들어서 순서를 정해 묶어둔다.

    }
}
