package day11.io.rw;

import day05.member.Member;
import day11.io.Path;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileReaderExample implements Path {

    public static void main(String[] args) {

        try(FileReader fr = new FileReader(Path.ROOT_PATH+"/membe.txt")){
            //버퍼스트림
            BufferedReader br = new BufferedReader(fr);
            String s = br.readLine();
            System.out.println("s = "+s);

            String[] split = s.split(",");
            System.out.println(Arrays.toString(split));

//            new Member(split[0],split[1],split[2],split[3],split[4],split[5])
//            int read = fr.read();
//            System.out.println((char)read);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
