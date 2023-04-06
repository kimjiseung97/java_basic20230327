package BookPractice;

import MemberPractice.Gender;
import day08.poly.book.Book;
import day08.poly.car.Stinger;

public class BookUser {

    private String name; //회원이름

    private int age; //회원나이

    private Gender gender; //성별

    private int couponCount; //쿠폰개수

    private  Book[] rentBookList; //빌린 책 정보들
    public BookUser() {
    }

    private BookUser(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public String getGenderToString(){
        return getGender() == Gender.MALE?"남성":"여성";
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getCouponCount() {
        return couponCount;
    }

    public void setCouponCount(int couponCount) {
        this.couponCount = couponCount;
    }
}
