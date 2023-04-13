package day13;

import day07.Util.Utility;

import java.util.Comparator;
import java.util.stream.Collectors;

import static day07.Util.Utility.*;
import static day13.Menu.*;
import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

public class Sorting {
    public static void main(String[] args) {

        //stream의 정렬 sorted

        //메뉴 목록중 칼로리가 낮은 순으로 정렬
        menuList.stream().sorted(comparing(dish -> dish.getCalories())).collect(toList()).forEach(dish -> System.out.println(dish));

        //메뉴 목록중 이름으로 내림차 정렬(zyx순)
        menuList.stream()
                .sorted(comparing(Dish::getName).reversed())
                .collect(toList())
                .forEach(d -> System.out.println(d));
        makeLine();
        menuList.stream().filter(dish -> dish.getCalories()>300).sorted(Comparator.comparing(d -> d.getCalories())).limit(3).collect(toList()).forEach(dish -> System.out.println(dish));



    }
}
