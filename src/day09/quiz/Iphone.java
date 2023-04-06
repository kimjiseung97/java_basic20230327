package day09.quiz;

public class Iphone extends SmartPhone{

    private String model;

    @Override
    public String information() {
        return "아이폰은 애플에서 만들어졌고 제원은 다음과같다\n"+makeCall()+takeCall()+takePicture()+Charge()+touchDisplay();
    }

    @Override
    public String Charge() {
        return "고속충전, 무선충전 지원\n";
    }

    @Override
    public String takePicture() {
        return "1200만, 1600만 트리플카메라\n";
    }

    @Override
    public String makeCall() {
        return "번호를 누르고 통화버튼을 누름\n";
    }

    @Override
    public String takeCall() {
        return "전화받기 버튼을 누름\n";
    }

    public Iphone(String model) {
        super.setModel(model);
    }

    @Override
    public String touchDisplay() {
        return "정전식\n";
    }
}
