package day12.lamda;

import day05.member.Gender;
import day05.member.Member;
import day07.Util.Utility;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static day07.Util.Utility.*;
import static day12.lamda.Color.*;
import static day12.lamda.FilterApple.*;
import static day12.lamda.MappingApple.*;

public class Main {
    public static void main(String[] args) {
        //사과 바구니를 생성

        List<Apple> appleBasket = List.of(
                new Apple(80, GREEN),
                new Apple(155, GREEN),
                new Apple(90, RED),
                new Apple(87, RED),
                new Apple(200, GREEN),
                new Apple(50, RED),
                new Apple(85, YELLOW),
                new Apple(75, YELLOW)

        );

        System.out.println("====녹색 사과 필터링 =======");
        List<Apple>greenApples = filterGreenApples(appleBasket);

        for (Apple greenApple : greenApples) {
            System.out.println(greenApple);
        }

        System.out.println("========노란 사과 필터링 =============");

        List<Apple> colorApples = fillterApplesByColor(appleBasket,YELLOW);

        for (Apple colorApple : colorApples) {
            System.out.println(colorApple);
        }



        System.out.println("========원하는 조건으로 필터링==================");
        List<Apple> filterApples = fillterApples(appleBasket, new LightApplePredicate());
        //100그램 이하의 사과들 필터링
        for (Apple filterApple : filterApples) {
            System.out.println(filterApple);
        }

        makeLine();
        //빨강 사과 필터링
        List<Apple> apples = fillterApples(appleBasket,(apple) -> apple.getColor() == RED);
        for (Apple apple : apples) {
            System.out.println(apple);
        }
        makeLine();



        //녹색이면서 100g보다 큰 사과들만 필터링
        List<Apple> apples1 = fillterApples(appleBasket, apple -> apple.getColor() == GREEN && apple.getWeight() > 100);
        for (Apple apple : apples1) {
            System.out.println(apple);
        }

        System.out.println("============================");

        List<Apple> filter = filter(appleBasket, apple -> apple.getWeight() >= 100 && apple.getWeight() <= 150);


        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8);

        List<Integer> filter1 = filter(numbers, n -> n % 2 == 0);
        System.out.println(filter1);

        List<String> wordList = List.of("moments","hello","apple","banana","ace","base","zebra");

        List<String> filter2 = filter(wordList, w -> w.length() == 5);

        System.out.println(filter2);

        List<String> collect = wordList.stream().filter(w -> w.length() < 5).collect(Collectors.toList());

        System.out.println("collect = " + collect);
        makeLine();

        List<Color> colorList = mappingAppleByColor(appleBasket);

        System.out.println(colorList);

        //회원정보에서 회원의 닉네임만 추출
        List<Member> memberList = List.of(
                new Member("abcd@def.com","1234","김개똥",1, Gender.MALE,25),
                new Member("abcd@def.com","1234","김개똥",1, Gender.MALE,25),
                new Member("abcd@def.com","1234","김개똥",1, Gender.MALE,25),
                new Member("abcd@def.com","1234","김개똥",1, Gender.MALE,25),
                new Member("abcd@def.com","1234","김개똥",1, Gender.MALE,25)
        );

//        List<Integer> nameList = map(memberList,m->m.memberName);

    }
}
