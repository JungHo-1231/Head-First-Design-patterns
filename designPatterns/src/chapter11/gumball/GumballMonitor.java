package chapter11.gumball;

public class GumballMonitor {
    GumballMachine machine;

    public GumballMonitor(GumballMachine machine) {
        this.machine = machine;
    }

    public void report(){
        System.out.println("뽑기 기계 위치 " +  machine.getLocation());
    }
}
