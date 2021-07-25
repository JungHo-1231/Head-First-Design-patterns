package chapter2.bookExample;

import chapter2.Crew;

public class Tiber implements Crew {
    @Override
    public void update(String msg) {
        System.out.println("Tiber 수신 : " + msg);
    }
}
