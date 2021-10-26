package chapter2.first_reading;

public class Jay implements Crew {
    @Override
    public void update(String msg) {
        System.out.println("Jay 수신 : " + msg);
    }
}
