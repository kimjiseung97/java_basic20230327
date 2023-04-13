package day13.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //List.of로 리스트를생성하면 수정할 수 없다.
        List<Student> students = new ArrayList<>(
                List.of(
                        new Student("송철수", 15, 79),
                        new Student("박영희", 17, 41),
                        new Student("손흥민", 11, 11),
                        new Student("감우성", 25, 34)
                )
        );


        //나이 순으로 오름차 정렬(나이 적은순)
        students.sort((o1, o2) -> o1.getAge() - o2.getAge());

        //이름 가나다순으로 오름차순 정렬
        students.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));

        students.forEach(student -> System.out.println(student));






    }
}
