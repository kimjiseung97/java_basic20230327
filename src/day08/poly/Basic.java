package day08.poly;

class A{}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}

public class Basic {
    //자식 객체는 상속관계에 있는 상위타입을 사용할 수 있다.
    Object X1 = new A();
    A x2 =new B();
    A x3 = new C();
    A x4 = new D();
    A x5 = new E();

    void test(){
        int a = 10;
        double b = a;

        B x = new B();
        A z = x;
 //       C y = (C)z; //다형성은 객체에서 말하는 타입 캐스팅 자식객체는 자기부모의 타입을 사용할 수있다
    }
}
