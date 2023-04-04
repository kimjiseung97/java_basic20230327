package day07.quiz;

class Parent {
    int compute(int num) {
        if( num <= 1) return num;
        return compute(num-1) + compute(num-2);
    }
}

class Child extends Parent {
    int compute(int num) {
        if( num <= 1) return num;
        return compute(num-1) + compute(num-3);
    }
}
public class GisaFirst {
    public static void main(String[] args) {
        Child obj = new Child();
        System.out.print(obj.compute(4));
    }
}
