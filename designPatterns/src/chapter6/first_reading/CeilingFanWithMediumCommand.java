package chapter6.first_reading;

public class CeilingFanWithMediumCommand implements Command {
    private CeilingFan ceilingFan;

    public CeilingFanWithMediumCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.medium();
    }

    @Override
    public void undo() {
        ceilingFan.off();
    }
}
