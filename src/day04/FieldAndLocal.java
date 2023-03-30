package day04;

public class FieldAndLocal {
    int a; // 필드에  미리 0을 넣어놓는다

    double[][]b;

    void mm(int b){ //b : 매개변수 애초에 사용하려면 무조건 값을 지정해야함
        int c = 0; // c : 지역변수 미리 값을 지정해놓지않으면 사용자체가 불가능

        if(a>10){
            c= 99;
        }else if(a<5){
            c= -100;
        }else {
            c = 55;
        }
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
