package MemberPractice;

public class Test {

    public static void main(String[] args) {

        MemberRepository mr = new MemberRepository();
        Member thief=new Member("abced@fff.com","3345","밥도둑",4,Gender.FEMALE,49);
        mr.addMember(thief);
        mr.showMembers();
//        mr.showMembers();
//       boolean flag =  mr.isPuplicateEmail("abced@fff.com");
//       System.out.println("flag = " + flag);




    }
}
