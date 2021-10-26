package chapter6.first_reading;

public class HottubOnCommand implements Command {

    private Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.bubblesOn();
    }

    @Override
    public void undo() {
        hottub.bubblesOff();
    }
}
