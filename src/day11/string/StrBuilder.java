package day11.string;

import day11.api.system.SystemExample;

public class StrBuilder {

    private static  void makeString(){
        long start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i <500000 ; i++) {
            s+="A";
        }
        long end = System.currentTimeMillis();

        System.out.println("총 소요시간 : "+(end-start)+"밀리 초");
    }

    private static  void makeStringBuilder(){
        long start = System.currentTimeMillis();
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i <500000 ; i++) {
            s.append("a");
        }
        long end = System.currentTimeMillis();

        System.out.println("총 소요시간 : "+(end-start)+"밀리 초");
    }
    public static void main(String[] args) {
        makeStringBuilder();
        makeString();
    }
}
