package day09.final_;

public class Main {
    public static void main(String[] args) {

        Person kim = new Person("김철수","0000111-31231234","대한민국",new BagPack(5,"샘소나이트"));

        kim.name = "신짱구";

        kim.bagPack = new BagPack(10,"NEPA");

    }
}
