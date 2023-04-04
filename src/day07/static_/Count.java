package day07.static_;

public class Count {

    //제한자(modifier)
    //접근 제한자(Access), 사용 제한자(Usage)
    public static int x; //정적필드 : 모든 객체가 공유
    public int y;       //인스턴스 필드 : 객체별로 관리
    
    
    //정적 메서드
    public static void m1(Count c4){
        System.out.println("static 메서드 호출");
        //필드 참조(static 메서드안에서는 static필드만 참조가능)
        //static은 this정보를 알 수가 없어서 호출불가능
        System.out.println("x = " + x);
//        System.out.println("y = " + y);

        Count c3 = new Count();
        System.out.println("c3.y = " + c3.y);
        System.out.println("c4.y = " + c4.y);
    }
    
    //인스턴스 메서드
    public void m2(){
        System.out.println("인스턴스 메서드 호출");
        System.out.println("x = " + x);
        System.out.println("this.y = " + this.y);
    }
}