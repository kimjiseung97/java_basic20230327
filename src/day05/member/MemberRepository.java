package day05.member;

import day02.StdIO;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

//역할 : 회원 저장소 역할
public class MemberRepository {
    public static final  int NOT_FOUND = -1;
    Member[] memberList;

    public MemberRepository() {
        this.memberList = new Member[0];
//        memberList[0] = new Member("abcd@def.com","콩벌레",1,Gender.MALE,50);
//        memberList[1] = new Member("zzzz@def.com","팥죽이",2,Gender.FEMALE,30);
//        memberList[2] = new Member("qwer@def.com","카레왕",3,Gender.MALE,44);
    }

    /*
        모든 회원 정보를 출력해주는 메서드
     */
    void showMembers(){
        System.out.printf("=========================현재 회원정보 (총 %d명) ===================\n",memberList.length);

        for (Member m: memberList) {
            System.out.println(m.inform());
        }
    }
    /*
    *  회원 가입 기능
    * @param1 - newMember : 새롭게 회원가입하는 회원의 정보
    * @return : 회원가입 성공여부 성공시 true 이메일이 중복되어 실패시 false
    */

     boolean addMember(Member newMember){

        //이메일이 중복인가 ?
         if(isDuplicateEmail(newMember.email))  return false;

        //실제로 멤버를 추가하는 코드
        Member[] temp = new Member[memberList.length+1];
        for (int i = 0; i <memberList.length ; i++) {
            temp[i] = memberList[i];
        }

        //회원 가입 시간 등록
         newMember.regDate = LocalDate.now();
        temp[temp.length-1] = newMember;
        memberList = temp;

        //save파일 생성
         try(FileWriter fw = new FileWriter("D:/exercise/membe.txt")) {

             String saveInfo  = "";
             saveInfo+=newMember.memberId;
             saveInfo+=","+newMember.memberName;
             saveInfo+=","+newMember.email;
             saveInfo+=","+newMember.gender;
             saveInfo+=","+newMember.age;
             saveInfo+=","+newMember.password;

             fw.append(saveInfo+"\n");


         } catch (IOException e) {
             System.out.println("파일 저장 실패!");
         } ;

        return true;
     }

    /*
    *  이메일의 중복여부를 확인하는 기능
    * @param targetEmail : 검사 대상 이메일
    * @return : 중복되었을 시 true, 사용가능할 시 false
    * */
    boolean isDuplicateEmail(String targetEmail){
        for (Member member : memberList) {
            if(targetEmail.equals(member.email)){
                return true;
            }
        }
        return false;
    }

    //마지막 회원의 번호를 알려주는 기능
    int getLastMemberId(){
        return !isEmpty()? memberList[memberList.length-1].memberId : 0;
    }

    /*이메일을 통해 특정 회원 객체를 찾아서 반환하는 기능
    * @param1 emaoil : 찾고싶은 회원의 이메일
    * @return : 찾은 회원의 객체정보 몾찾으면 null반환 */

    Member findByEmail(String email){
        for (Member m: memberList) {
            if(email.equals(m.email)){
                return m;
            }
        }
        return null;
    }

    /*
    * @param email : 탐색 대상의 이메일
    * @return : 찾아낸 인덱스 못찾으면 -1리턴*/
    int findIndexEmail(String email){
        for (int i = 0; i <memberList.length ; i++) {
            if(memberList[i].email.equals(email)){
                return i;
            }
        }
        return -1;
    }


    /*
    * 비밀번호를 수정하는 기능
    * @param email : 수정 대상의 이메일
    * @param newPassword : 변경할 새로운 비밀번호
    * */
    boolean changePassword(String email, String newPassword){
        //수정진행
       int indexNumber = findIndexEmail(email);
       if(indexNumber==-1){
          return false;
       }else{
           memberList[indexNumber].password = newPassword;
           return true;
       }
    }

    void removeMember(String email) {
        // 인덱스 찾기
        int delIndex = findIndexEmail(email);

        // 앞으로 땡기기
        for (int i = delIndex; i < memberList.length - 1; i++) {
            memberList[i] = memberList[i + 1];
        }

        // 배열 마지막 칸 없애기
        Member[] temp = new Member[memberList.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = memberList[i];
        }
        memberList = temp;
    }


    //멤버가 있는지없는지 확인

    boolean isEmpty(){
        return memberList.length==0;
    }



}


