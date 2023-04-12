package day13;


import day08.poly.book.Book;
import day08.poly.car.Stinger;
import day13.Dish.Type;

//요리 정보 중에 이름만 칼로리만 관리하는 객체
public class SimpleDish {

    private final String name;
    private final String calories;


    public SimpleDish(Dish dish){
        this.name = dish.getName();
        this.calories =dish.getCalories() + "kcal";
    }

    public SimpleDish(String name, String calories) {
        this.name = name;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public String getCalories() {
        return calories;
    }


    @Override
    public String toString() {
        return "SimpleDish{" +
                "name='" + name + '\'' +
                ", calories='" + calories + '\'' +
                '}';
    }
}
