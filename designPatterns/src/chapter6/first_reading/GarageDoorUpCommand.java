package chapter6.first_reading;

public class GarageDoorUpCommand implements Command {

    GarageDoor door;

    public GarageDoorUpCommand(GarageDoor door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.up();
    }

    @Override
    public void undo() {
        door.down();
    }
}
