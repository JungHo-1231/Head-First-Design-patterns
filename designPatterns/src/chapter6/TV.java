package chapter6;

public class TV {
    private String location;
    private int channel;

    public TV(String location) {
        this.location = location;
    }

    public void on(){
        System.out.println("Tv is on");
    }

    public void off(){
        System.out.println("Tv is off");
    }

    public void setInputChannel(){
        channel = 3;
        System.out.println("Channel is set for VRC");
    }
}
