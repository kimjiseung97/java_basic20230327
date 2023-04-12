package day13;

public class DishNameType {

    private final String name;
    private final Dish.Type type;

    public DishNameType(Dish dish){
        this.name = dish.getName();
        this.type = dish.getType();
    }

    @Override
    public String toString() {
        return "DishNameType{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
