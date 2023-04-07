package day10.generic;

import day04.array.StringList;
import day09.Singer.Artist;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        AppleBasket ab = new AppleBasket();
        ab.setApple(new Apple());
        Apple apple = ab.getApple();

        BananabBasket bb = new BananabBasket();
        bb.setBanana(new Banana());

        Basket<Apple> apples = new Basket();
        apples.setFruit(new Apple());

        Apple fruit = apples.getFruit();

        Basket<Banana> bananas = new Basket<>();
        bananas.setFruit(new Banana());

        bananas.getFruit();

        MyList<String> s1 = new MyList<>();
        s1.push("짬뽕");
        s1.push("짜장");
        s1.push("탕수육");
        System.out.println(s1);

        MyList<Integer> s2 = new MyList<>();

        s2.push(1);
        s2.push(2);
        s2.push(3);
        s2.push(4);

        System.out.println(s2);


        MyList<Artist> artist = new MyList<>();

        artist.push(new Artist("동방신기", new StringList("주문")));




    }
}
