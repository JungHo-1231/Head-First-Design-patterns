package chapter2;

import chapter2.bookExample.Tiber;

public class Main {
    public static void main(String[] args) {
        Baedi baedi = new Baedi();

        Lewin lewin = new Lewin();
        Tiber tiber = new Tiber();
        Jay jay = new Jay();

        baedi.subscribe(lewin);
        baedi.subscribe(tiber);
        baedi.subscribe(jay);

        baedi.upgradeCutie();
    }
}
