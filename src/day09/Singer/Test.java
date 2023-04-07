package day09.Singer;

import day04.array.StringList;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //가수 객체 생성
        Artist kim = new Artist("동방신기", new StringList("hug"));

        StringList songList = kim.getSongList();

        kim.info();

        String [] str =  songList.getsArr();

        System.out.println(Arrays.toString(str));

    }
}
