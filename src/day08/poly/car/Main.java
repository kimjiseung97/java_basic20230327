package day08.poly.car;

import day07.Util.Utility;

import static day07.Util.Utility.*;

public class Main {
    public static void main(String[] args) {

        CarShop shop = new CarShop();
        shop.runTest();

        makeLine();

        Driver park = new Driver();

        park.drive(new Mustang());

        makeLine();

//        Mustang mustang = new Mustang();
//        mustang.accelerate();
//        mustang.powerSound();
//
//        Stinger stinger = new Stinger();
//        stinger.accelerate();

        makeLine();

        Car car = shop.exportCar(6000);
//        System.out.println("car = " + car);
        System.out.println(car instanceof Stinger);

    }
}
