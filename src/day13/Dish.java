package day13;

public class Dish {

    //final은 불변성 static은 유일성
    private final String name; //요리이름

    private final boolean vegeterian; //채식주의 여부

    private final int calories; //칼로리

    private final Type type; //요리 카테고리

    public Dish(String name, boolean vegeterian, int calories, Type type) {
        this.name = name;
        this.vegeterian = vegeterian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegeterian() {
        return vegeterian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", vegeterian=" + vegeterian +
                ", calories=" + calories +
                ", type=" + type +
                '}';
    }

    public enum Type{
        MEAT,FISH,OTHER
    }
}
