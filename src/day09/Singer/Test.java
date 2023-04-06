package day09.Singer;

import day04.array.StringList;

public class Test {
    public static void main(String[] args) {
        //가수 객체 생성
        Artist kim = new Artist("동방신기", new StringList("hug"));

        StringList songList = kim.getSongList();

        kim.info();

    }
}
