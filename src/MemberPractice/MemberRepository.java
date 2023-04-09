package MemberPractice;

import day07.Util.Utility;

import static day07.Util.Utility.*;

//역할 : 회원 저장소 역할
public class MemberRepository {


    Member[] memberList;

    public MemberRepository() {
        this.memberList = new Member[3];
        memberList[0] = new Member("abc@bbb.com", "1234", "김카레", 1, Gender.MALE, 25);
        memberList[1] = new Member("abc@ccc.com", "1234", "김단팥", 2, Gender.MALE, 35);
        memberList[2] = new Member("abc@def.com", "1234", "이호박죽", 3, Gender.FEMALE, 50);
    }

    /*모든 회원 정보를 출력해주는 메서드*/
    void showMembers() {
        System.out.printf("============현재 회원 정보 (총 %d명)============\n", memberList.length);
        for (Member m : memberList) {
            System.out.println(m.inform());
        }
    }

    /*회원가입 기능
     * @param1 - newMember : 새롭게 회원가입하는 회원의 정보
     * @return : 회원가입 성공여부 성공시 true 이메일이 중복되어 실패시 false*/
    boolean addMember(Member newMember) {

        //이메일이 중복인가?
        if (isPuplicateEmail(newMember.email)) return false;
        //실제로 멤버를 추가하는코드
        Member[] temp = new Member[memberList.length + 1];

        for (int i = 0; i < memberList.length; i++) {
            temp[i] = memberList[i];
        }
        temp[temp.length - 1] = newMember;

        memberList = temp;

        return true;
    }

    /*
     * 이메일의 중복여부를 확인하는 기능
     * @param1 targerEmail : 검사대상 이메일
     * @return : 중복되었을 시 true 사용가능할 시 false*/

    boolean isPuplicateEmail(String targetEmail) {
        for (int i = 0; i < memberList.length; i++) {
            if (targetEmail.equals(memberList[i].email)) {
                return true;
            }
        }
        return false;
    }

    // 마지막 회원의 번호를 알려주는 기능

    int getLastMemberId() {
        return !isempty() ? memberList[memberList.length - 1].memberId : 0;
    }

    private boolean isempty() {
        return memberList.length == 0;
    }

    Member findByEmail(String email) {
        for (Member m : memberList) {
            if (email.equals(m.email)) {
                return m;
            }
        }
        return null;
    }


    public void showprivateMember() {
        String email = input("찾을 회원의 이메일을 입력하세요 : ");
        Member findMember = findByEmail(email);
        if (findMember != null) {
            System.out.println("email : " + findMember.email);
            System.out.println("이름 : " + findMember.memberName);
            System.out.println("성별 : " + findMember.gender);
            System.out.println("나이 : " + findMember.age);
            //비밀번호는 중요정보이기때문에 공개하지않는다
        } else {
            System.out.println(email + "회원을 찾지못했습니다.");
        }
    }

    private int findbyIndexEmail(String email) {

        for (int i = 0; i < memberList.length; i++) {
            if (email.equals(memberList[i].email)) {
                return i;
            }
        }
        return -1;
    }

    public void deleteMember() {
        String email = input("삭제할 사람의 이메일을 입력하세요 : ");
        int findIndex = findbyIndexEmail(email);

        if(findIndex!=-1){
            for (int i = findIndex; i <memberList.length-1 ; i++) {
                memberList[i] = memberList[i+1];
            }
            Member temp[] = new Member[memberList.length-1];
            for (int i = 0; i <temp.length ; i++) {
                temp[i] = memberList[i];

            }
            memberList = temp;
            System.out.println(email + "회원정보를 삭제 완료했습니다");
        }else{
            System.out.println(email + "회원을 찾지못했습니다.");
        }

    }
}

