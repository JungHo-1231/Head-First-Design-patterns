package chapter2.first_reading;

import chapter2.first_reading.Crew;

public class Tiber implements Crew {
    @Override
    public void update(String msg) {
        System.out.println("Tiber 수신 : " + msg);
    }
}
