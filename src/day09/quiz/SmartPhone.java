package day09.quiz;

public abstract class SmartPhone implements Camera, PhoneCall,Touchable{

    private String model; //모델명

    public abstract String information();

    public abstract String Charge();

    public String getModel() {
        return model;
    }


    public void setModel(String model) {
        this.model = model;
    }
}
