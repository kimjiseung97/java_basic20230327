package day11.api.obj;

import java.util.Objects;

public class Pen extends Object{

    Company company; //제조회사

    long serial; // 시리얼 번호
    String color; // 색상
    int price; // 가격
    Integer price1; // 클래스로 선언하면 null 기본값 선언하면 0
    public Pen(long serial, String color, int price) {
        this.serial = serial;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "company=" + company +
                ", serial=" + serial +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }


    //시리얼 번호가 같으면 같은 객체로 보고싶다.
    //equals를 오버라이딩하면 반드시 hashCode도 같이 오버라이딩해라
    @Override
    public boolean equals(Object obj) {

        if(obj instanceof  Pen){
            Pen target = (Pen) obj;
            return this.serial == target.serial
                && this.color == target.color;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(serial, color);
    }
}
