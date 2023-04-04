package day07.static_;

import day07.Util.Utility;
import day07.protec.pac2.C;

//static 필드와 메서드를 그냥 참조 가능
import static day07.Util.Utility.*;
import static day07.static_.Count.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {

        out.println(x);
        out.println(random());

        m1(new Count());

        Count c1 = new Count();
        Count c2=  new Count();

        c2.m2();

        m1(new Count());

      x =10;
      c2.y = 20;


      out.printf("c1 =x : %d, y : %d\n", x,c1.y);
      out.printf("c2 =x : %d, y : %d\n", x,c2.y);

      Calculator cal1 = new Calculator();
      Calculator cal2 = new Calculator();

      cal1.color = "빨강";
      cal2.color = "초록";
      Calculator sharp = new Calculator();
      Calculator.calcAreaCircle(4);

      sharp.paint("red");

      makeLine();

      makeLine();
      random();
      input("하하 호호 : ");
    }
}
