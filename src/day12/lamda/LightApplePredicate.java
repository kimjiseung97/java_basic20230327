package day12.lamda;

public class LightApplePredicate implements ApplePredicate{


    @Override
    public boolean test(Apple apple) {
        return apple.getWeight()<=100 ;
    }
}
