package day04;
//실행용 클래스
//여기에는 설계를 하지않고 main메서드를 작성합니다.
public class DancerMain {
    public static void main(String[] args) {

        Dancer kim = new Dancer();
        Dancer park = new Dancer("스트릿댄스");
        Dancer jang = new Dancer("장동견","목각댄스",DanceLevel.PRO);

        Singer song  = new Singer("김아무개");

//        kim.dancerName = "김관종";
//        kim.crewName = "서커스크루";
        System.out.println(kim);
        System.out.println(park);
        System.out.println(kim.introduce());
        System.out.println(park.introduce());
        System.out.println(jang.introduce());
        kim.dance();
        park.dance();
        jang.dance();


    }
}