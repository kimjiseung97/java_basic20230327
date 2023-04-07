package day10.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListSearchQuiz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        String[] tvxq = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};
        List<String> tvxq= new ArrayList<>(
                Arrays.asList("영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호")
        );
        System.out.println("* 변경 전 정보: " + tvxq);

//        while(true){
//            System.out.println("수정할 멤버의 이름을 입력하세요.");
//            System.out.print(">>");
//            String modifyMember = sc.nextLine();
//            for (int i = 0; i < tvxq.length; i++) {
//                if (modifyMember.equals(tvxq[i])) {
//                    System.out.println(modifyMember + "의 별명을 변경합니다");
//                    System.out.print(">>");
//                    modifyMember = null;
//                    modifyMember = sc.nextLine();
//                    tvxq[i] = modifyMember;
//                    System.out.println("변경완료");
//                    System.out.println("변경후 정보 : " + Arrays.toString(tvxq));
//                }
//            }
//            System.out.println(modifyMember + "은 없는멤버입니다");
//            }
        while (true) {
            System.out.println("- 수정할 멤버의 이름을 입력하세요.");
            System.out.printf(">> ");
            String targetName = sc.next();

            int targetIndex =tvxq.indexOf(targetName);

            if (targetIndex!=-1) {
                System.out.println("- 수정하고싶은 이름을 입력하세요.");
                System.out.printf(">> ");
                String replaceName = sc.next();
                tvxq.set(targetIndex , replaceName);

                System.out.println("* 변경 후 정보 : "+tvxq);
            }else{
                System.out.println(targetName + "은 찾을수 없어요");
            }
            //탐색 알고리즘
//            int index = -1;
//            for (int i = 0; i < tvxq.size(); i++) {
//                if (targetName.equals(tvxq[])) {
//                    index = i;
//                    break;
//                }
//            }

            //수정 여부 판단
//            if (index > -1) {
//                System.out.printf("%s의 별명을 변경합니다.\n", targetName);
//                System.out.printf(">> ");
//                String newName = sc.next();
//                tvxq[index] = newName;
//                System.out.println("변경 완료!!");
//                System.out.println("* 변경 후 정보: " + Arrays.toString(tvxq));
//                break;
//            } else {
//                System.out.printf("%s은(는) 없는 이름입니다.\n", targetName);
//            }
        } //end while
//        sc.close();
    }

}

        // 1. 수정 타겟의 이름을 입력받는다.
        // 2. 해당 이름이 있는지 탐색해본다.
        // 3. 탐색에 성공하면 해당 이름의 인덱스를 알아온다.
        // 4. 탐색에 실패하면 실패한 증거를 확보한다.
        // 5. 성공했을 시 수정을 원하는 새로운 이름을 입력받는다.
        // 6. 찾은 인덱스를 통해 새로운 이름으로 수정한다.
        // 7. 위 내용을 수정이 정확히 완료될때까지 반복한다.

