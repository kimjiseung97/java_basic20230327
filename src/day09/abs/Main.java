package day09.abs;

public class Main {
    public static void main(String[] args) {

        Pet[] pets = {
                new Dog("해피","푸들",2),
                new Dog("초코","시추",3),
                new Dog("최강","불독",4),
                new Cat("나비","러시안블루",2),
        };



        for (Pet pet : pets) {
            pet.takeNap();
            pet.eat();
        }
    }
}
