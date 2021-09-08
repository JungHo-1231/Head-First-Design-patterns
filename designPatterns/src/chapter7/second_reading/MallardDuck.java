package chapter7.second_reading;

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fiy() {
        System.out.println("I'm flying");
    }
}
