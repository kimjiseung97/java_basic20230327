package myrecipe;

import java.util.ArrayList;

public class food {

    private ArrayList<ArrayList<food>> foodlist;

    public food() {

    }

    public void add(ArrayList<food> localfood) {
        this.foodlist.add(localfood);
    }

}
