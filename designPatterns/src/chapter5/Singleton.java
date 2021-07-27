package chapter5;

public class Singleton {
    private static Singleton uniqueInstance;

    // 기타 인스턴스 변수

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
