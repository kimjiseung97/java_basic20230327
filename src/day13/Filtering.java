package day13;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static day07.Util.Utility.makeLine;
import static day13.Dish.Type.*;
import static day13.Menu.*;
import static java.util.stream.Collectors.*;

public class Filtering {

    public static void main(String[] args) {

        //stream의 filter
        //필터조건에맞는 데이터들을 필터링

        //메뉴목록중에 채식주의자가 먹을 수 있는 요리를 알려주세요

        List<Dish> filteredList = menuList.stream()
                .filter(Dish::isVegeterian)
                .collect(toList());

        System.out.println("=====채식주의자 식용 요리 목록 ========");
//        for (Dish dish : filteredList) {
//            System.out.println("dish = " + dish);
//        }
        filteredList.forEach(System.out::println);

        //메뉴 목록중에 육류이면서 600칼로리 미만인 요리 필터링
        makeLine();
        //메뉴 목록에서 요리의 이름이 4글자인 요리들만 필터링해서 출력
        menuList.stream().filter(dish -> dish.getName().length()==4).collect(toList()).forEach(dish -> System.out.println(dish));
        makeLine();
        menuList.stream().filter(dish -> dish.getType()== MEAT && dish.getCalories()<600).collect(toList()).forEach(dish -> System.out.println(dish));

        String greeting = "hello world!";
        String upperCase = greeting.toUpperCase();
        String substring = upperCase.substring(0,5);
        char c = substring.charAt(2);

        char c1= "hello world".toUpperCase().substring(0,5).charAt(2);

        //원하는 개수만 필터링하기
        //칼로리가 300칼로리보다 큰 요리중 앞에서 3개만 필터링
        makeLine();
        menuList.stream().filter(dish -> dish.getCalories()>300).limit(3).collect(toList()).forEach(dish -> System.out.println(dish));
        makeLine();

        // 칼로리가 300칼로리보다 높은 요리중 처음2개는 제끼고 필터링
        menuList.stream().filter(dish -> dish.getCalories()>300).skip(2).limit(3).collect(toList()).forEach(dish -> System.out.println(dish));
        makeLine();
        //메뉴 목록에서 처음 등장하는 2개의 고기 요리를 필터링
        List<Dish> filterMeatList = menuList.stream().filter(dish -> dish.getType() == MEAT).limit(2).collect(toList());

        System.out.println("filterMeatListSize = " + filterMeatList.size());
        System.out.println("filterMeatList = " + filterMeatList);

        makeLine();

        List<Integer> numbers = List.of(1, 2, 1, 3, 3, 2, 4, 4, 5, 6);

        //리스트에서 중복제거하기
        makeLine();
        List<Integer> disinctedList = numbers.stream().filter(n -> n%2==0).distinct().collect(toList());

        System.out.println("distinctedList = " + disinctedList);


    }
}
