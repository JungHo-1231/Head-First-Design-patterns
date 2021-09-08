package chapter7.second_reading;

/**
 * first you need to implement the interface of the type you're adapting to.
 * This is the interface your client expects to see.
 */
public class TurkAdapter implements Duck {

    Turkey turkey;

    public TurkAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fiy() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
