package day12.lamda;

//사과중에 원하는 필드들만 추출해서 새로운 리스트로 만들기

import java.util.ArrayList;
import java.util.List;

public class MappingApple {

    //사과의 색상만 추출
    public static List<Color> mappingAppleByColor(List<Apple> appleBasket){
        List<Color> colorList = new ArrayList<>();
        for (Apple apple : appleBasket) {
            colorList.add(apple.getColor());
        }
        return colorList;
    }


//    public static List<Y> map(List<Y> appleBasket, GenericFunction<X,Y> mapper){
//        List<Y> colorList = new ArrayList<>();
//        for (X x : appleBasket) {
//            Y Y = mapper.apply(x);
//            colorList.add(y);
//        }
//        return colorList;
//    }
}
