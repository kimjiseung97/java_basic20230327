package day13;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static day07.Util.Utility.*;
import static day13.Menu.*;

public class Mapping {

    public static void main(String[] args) {

        //stream map : 리스트에서 원하는 정보만 추출

        //메뉴 목록에서 요리의 이름들만 목록으로 추출
        List<String> dishNames = menuList.stream().map(dish -> dish.getName()).collect(Collectors.toList());

        System.out.println("dishNames = " + dishNames);


        makeLine();

        List<String> words = List.of(
                "safari",
                "chrome",
                "edge",
                "opera",
                "firefox"
        );

        List<Integer> wordsLength = words.stream().map(w -> w.length()).collect(Collectors.toList());

        System.out.println("wordsLength = " + wordsLength);

        makeLine();

        //메뉴 목록에서 메뉴이름과 칼로리를 추출하는데 칼로리를 정수가아닌 무자열로 kcal을 뒤에 붙여서 추출후
        //메뉴이름  : xxxkcal로 반복 출력하고싶음

        List<SimpleDish> simpledish = menuList.stream().map(dish -> new SimpleDish(dish)).collect(Collectors.toList());

        simpledish.forEach(simpleDish -> System.out.println(simpleDish));

        /*
        * 메뉴 목록에서 칼로리가 500칼로리보다 큰 음식을을 필터링한 다음에 음식의 이름과 타입만 추출해서 출력해주세요
        * */
        makeLine();
        menuList.stream()
                .filter(d -> d.getCalories() > 500)
                .map(d -> new DishNameType(d))
                .collect(Collectors.toList())
                .forEach(dnt -> System.out.println(dnt));

        makeLine();

        //메뉴 목록에있는 요리들의 총 칼로리 수 구하기
        int total = menuList.stream().mapToInt(d -> d.getCalories()).sum();

        System.out.println("total = " + total);
        
        makeLine();

        double averageCal = menuList.stream().mapToInt(d -> d.getCalories()).average().getAsDouble();

        System.out.println("averageCal = " + averageCal);


    }
}
