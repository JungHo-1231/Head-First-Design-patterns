package chapter2.first_reading;

public class Lewin implements Crew{
    @Override
    public void update(String msg) {
        System.out.println("Lewin 수신 : " + msg);
    }
}
