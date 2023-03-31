package day05.member;

public class Test {
    public static void main(String[] args) {

        MemberRepository mr = new MemberRepository();

        Member thief = new Member("qwer@aaa.com","밥도둑",4,Gender.MALE,38);

        mr.addMember(thief);
        mr.addMember(thief);
        mr.showMembers();
        
        boolean flag = mr.isDuplicateEmail("qwer@aaa.com");

        System.out.println("flag = " + flag);
    }
}
