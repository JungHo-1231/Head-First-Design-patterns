package chapter7.first_reading.adapter;

/**
 * 우선 적응시킬 형식의 인터페이스를 구현해야 합니다.
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    /**
     * 그리고 원래 형식의 객체에 대한 레퍼린스가 필요합니다.
     * 여기에서는 생성자에서 래퍼런스를 받아오는 작업을 처리합니다.
     */
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
