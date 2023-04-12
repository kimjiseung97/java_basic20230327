package day13;

import java.util.Comparator;

import static day13.Menu.*;

public class Finding {
    public static void main(String[] args) {
        
        //메뉴 목록에서 채식주의자가 먹을 수 있는요리가 하나라도 존재하는가?
        boolean b = menuList.stream().anyMatch(dish -> dish.isVegeterian());
        System.out.println("b = " + b);

        boolean flag = menuList.stream().anyMatch(dish -> dish.getCalories() < 100);

        System.out.println("flag = " + flag);
        

        //요리 메뉴 목록의 모든 요리가 1000칼로리 미만인가?

        boolean flag1 = menuList.stream().allMatch(dish -> dish.getCalories() < 1000);
        System.out.println("flag1 = " + flag1);

        //nonMatch : allMatch의 반대연산

        Dish dish1 = menuList.stream().min(Comparator.comparing(dish -> dish.getCalories())).get();

        System.out.println("dish1 = " + dish1);

    }
}
