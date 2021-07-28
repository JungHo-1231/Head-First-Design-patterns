package chpater7.adapter;

public class DuckTestDrive {
    public static void main(String[] args) {
        /** Duck 을 생성 */
        MallardDuck mallardDuck = new MallardDuck();

        /** turkey 을 생성 */
        WildTurkey turkey = new WildTurkey();

        /**
         * Turkey 는 TurkeyAdapter 로 감싸서 Duck 처럼
         * 보이도록 만듭니다.
         */
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\n The TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
