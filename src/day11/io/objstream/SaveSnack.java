package day11.io.objstream;

import day08.poly.car.Stinger;
import day11.io.Path;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SaveSnack {

    private static List<Snack> snackList = new ArrayList<>();

    public static void main(String[] args) {

        snackList.add(new Snack("콘칲",1970,1500,Snack.Taste.GOOD));
        snackList.add(new Snack("사브레",1980,2500,Snack.Taste.BAD));
        snackList.add(new Snack("오징어집",1985,1800,Snack.Taste.SOSO));
        snackList.add(new Snack("스윙칩",1985,1800,Snack.Taste.BAD));

        saveFile();
    }



    //객체를 통체로 파일에 저장
    private static void saveFile(){
        try (FileOutputStream fos = new FileOutputStream(Path.ROOT_PATH+"/snack.sav")){

            //객체 저장을 위한 보조스트림
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(snackList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //텍스트파일로 리스트 데이터 저장
    private static void saveTextFile(){
        try (FileWriter fw = new FileWriter(Path.ROOT_PATH+"/snack.txt")){
            for (Snack snack : snackList) {
                fw.write(String.format("%s,%d,%d,%s\r\n", snack.getSnackName(), snack.getYear(), snack.getPrice(), snack.getTaste()));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
