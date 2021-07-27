package chapter5;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler uniqueInstance = new ChocolateBoiler();

    public static ChocolateBoiler getUniqueInstance() {
        return uniqueInstance;
    }

    /**
     * 이 코드는 보일러가 비어있을 때만 돌아갑니다.
     */
    private ChocolateBoiler() {
    }

    /**
     * 보일러가 비어있을 때만 재료를 집어 넣습니다. 원료를 가득 채우고 나면 empty 와 boiled 플레그를 false 로 설정합니다.
     */
    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // 보일러에 우유/초콜릿을 혼합한 재료를 집어 넣음
        }
    }

    /**
     * 보일러가 가득 차 있고 (비어있지 않고),다 끓여진 상태에서만 보일러에 들어있는 * 재료를 다음 단계로 넘깁니다.
     */
    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    /**
     * 보일러가 가득 차 있고 아직 끊지 않은 상태에서만 초콜릿과 우유가 혼합된 재료를 끓입니다. 재료가 다 끓고 나면 boiled 플래그를 true 로 설정합니다.
     */
    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // 재료를 끓임임
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
