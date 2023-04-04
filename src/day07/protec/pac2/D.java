package day07.protec.pac2;

import day07.protec.pac1.A;

public class D extends A {

    D(){
        super(10);
        f1 = 1; //protected 데이터는 상속을 통해서 사용이가능하다
//        f2 = 2;

        m1();
//        m2();
    }
}
