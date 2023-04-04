package day07.quiz;

public class Parent1 {
    public String nation;

    public Parent1() {
        this("대한민국");
        System.out.println("Parent() call!");
    }

    public Parent1(String nation) {
        this.nation = nation;
        System.out.println("Parent(String) call!");
    }
}
