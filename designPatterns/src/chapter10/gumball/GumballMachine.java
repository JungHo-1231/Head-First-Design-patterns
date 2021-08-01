package chapter10.gumball;

public class GumballMachine {

    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;

        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    /** 행동을 메서드로 구현합니다. */
    public void insertQuarter(){
        if (state == HAS_QUARTER) {
            System.out.println("동전은 한 개만 넣어주세요");
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("동전을 넣으셨습니다.");
        } else if (state == SOLD_OUT) {
            System.out.println("매진되었습니다. 다음 기회에 이용해주세요");
        } else if (state == SOLD) {
            System.out.println("잠깐만 기다려 주세요. 알맹이가 나가고 있습니다.");
        }
    }

    /** 사용자가 동전을 반환 받으려고 하는 경우 */
    public void ejectQuarter(){
        if (state == HAS_QUARTER) {
            System.out.println("동전이 반환됩니다.");
            state = NO_QUARTER;
        } else if (state == NO_QUARTER) {
            System.out.println("동전을 넣어주세요.");
        } else if (state == SOLD) {
            System.out.println("이미 알맹이를 뽑으셨습니다.");
        } else if (state == SOLD_OUT) {
            System.out.println("동전을 넣이 않으셨습니다. 동전이 반횐되지 않습니다.");
        }
    }

    /** 손잡이를 돌리는 경우 */
    public void turnCrank() {
        if (state == SOLD) {
            System.out.println("Turning twice doesn't get you another gumball!");
        } else if (state == NO_QUARTER) {
            System.out.println("You turned but there's no quarter");
        } else if (state == SOLD_OUT) {
            System.out.println("You turned, but there are no gumballs");
        } else if (state == HAS_QUARTER) {
            System.out.println("You turned...");
            state = SOLD;
            dispense();
        }
    }

    /** 알맹이 꺼내기 */
    public void dispense() {
        if (state == SOLD) {
            System.out.println("알맹이가 나가고 있습니다. ");
            count--;
            if (count == 0) {
                System.out.println("더 이상 알맹이가 없습니다.");
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        } else if (state == NO_QUARTER) {
            System.out.println("동전을 넣어주세요");
        } else if (state == SOLD_OUT) {
            System.out.println("매진입니다");
        } else if (state == HAS_QUARTER) {
            System.out.println("알맹이가 나갈 수 없습니다");
        }
    }
    // toString(), refill() 가 같은 메소드
}












































