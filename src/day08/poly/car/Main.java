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

    }
}
