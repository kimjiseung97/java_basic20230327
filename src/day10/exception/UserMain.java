package day10.exception;

public class UserMain {
    public static void main(String[] args) {

        LoginUser user = new LoginUser("abc1234","1234");

        try {
            user.loginValidate("abc1234","1234");
        } catch (LoginValidateException e) {
            //getMessage : 에러원인 메시지를 리턴
            System.out.println(e.getMessage());
        }

    }
}
