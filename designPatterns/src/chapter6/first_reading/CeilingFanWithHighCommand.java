package chapter6.first_reading;

public class CeilingFanWithHighCommand implements Command  {
    private CeilingFan ceilingFan;

    public CeilingFanWithHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.high();
    }

    @Override
    public void undo() {
        ceilingFan.off();
    }
}
