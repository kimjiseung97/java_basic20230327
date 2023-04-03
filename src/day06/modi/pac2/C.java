package day06.modi.pac2;

import day06.modi.pac1.A;

public class C {

    void test(){

        A a = new A(); //public
//        new A(11); //default
//        new A("zzzz") // private
        a.f1 = 10; // public
//        a.f2 = 20; //default
//        a.f3 = 30; //private

        a.m1(); // public
//        a.m2(); //default
//        a.m3(); //default


//        B b = new B(); //b클래스 자체가 default제한자가 걸려있기때문에 접근자체가 불가능함
//        b.x1 = 1;
//        b.x2 = 2;
    }

}
