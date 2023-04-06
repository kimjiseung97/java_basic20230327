package day09.quiz;

public class Galaxy extends SmartPhone implements Pencil{

    private String model;

    @Override
    public String information() {
        return "갤럭시는 삼성에서만들었고 제원은 다음과 같다\n"+makeCall()+takeCall()+takePicture()+Charge()+touchDisplay()+"블루투스펜 탑재여부 : "+bluetoothPen();
    }

    @Override
    public String Charge() {
        return "고속충전, 무선충전 지원\n";
    }

    @Override
    public String takePicture() {
        return "1300만 듀얼카메라\n";
    }

    @Override
    public String makeCall() {
        return "번호를 누르고 통화버튼을 누름\n";
    }

    @Override
    public String takeCall() {
        return "전화받기버튼을 누름\n";
    }

    @Override
    public boolean bluetoothPen() {
        return true;
    }

    public Galaxy(String model) {
        super.setModel(model);
    }

    @Override
    public String touchDisplay() {
        return "정전식, 와콤펜 지원\n";
    }
}
