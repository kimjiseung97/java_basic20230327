package MemberPractice;

//역할 : 회원 저장소 역할
public class MemberRepository {


    Member[] memberList;

    public MemberRepository() {
        this.memberList = new Member[3];
        memberList[0] = new Member("abc@bbb.com","1234","김카레",1,Gender.MALE,25);
        memberList[1] = new Member("abc@ccc.com","1234","김단팥",2,Gender.MALE,35);
        memberList[2] = new Member("abc@def.com","1234","이호박죽",3,Gender.FEMALE,50);
    }

    /*모든 회원 정보를 출력해주는 메서드*/
    void showMembers(){
        System.out.printf("============현재 회원 정보 (총 %d명)============\n",memberList.length);
        for(Member m: memberList) {
            System.out.println(m.inform());
        }
    }

    /*회원가입 기능
    * @param1 - newMember : 새롭게 회원가입하는 회원의 정보
    * @return : 회원가입 성공여부 성공시 true 이메일이 중복되어 실패시 false*/
    boolean addMember(Member newMember){

        //이메일이 중복인가?
        if(isPuplicateEmail(newMember.email)) return false;
        //실제로 멤버를 추가하는코드
        Member[] temp = new Member[memberList.length+1];

        for (int i = 0; i <memberList.length ; i++) {
            temp[i] = memberList[i];
        }
        temp[temp.length-1] = newMember;

        memberList = temp;

        return true;
    }

    /*
    * 이메일의 중복여부를 확인하는 기능
    * @param1 targerEmail : 검사대상 이메일
    * @return : 중복되었을 시 true 사용가능할 시 false*/

    boolean isPuplicateEmail(String targetEmail){
        for (int i = 0; i < memberList.length ; i++) {
            if(targetEmail.equals(memberList[i].email)){
                return true;
            }
        }
        return false;
    }

    // 마지막 회원의 번호를 알려주는 기능

    int getLastMemberId(){
        return memberList[memberList.length-1].memberId;
    }

   Member findByEmail(String email){
       for (Member m: memberList) {
           if(email.equals(m.email)){
               return m;
           }
       }
       return null;
   }
}
