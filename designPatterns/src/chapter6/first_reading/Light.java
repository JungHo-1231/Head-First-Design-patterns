package chapter6.first_reading;

public class Light {
    private String location = "";

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println("Light is on!!");
    }

    public void off(){
        System.out.println("Light is off!!");
    }

}
