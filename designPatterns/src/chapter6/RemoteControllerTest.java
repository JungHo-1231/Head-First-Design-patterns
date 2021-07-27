package chapter6;

public class RemoteControllerTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();

        Light light = new Light("some where over the rainbow");
        LightOnCommand lightOn = new LightOnCommand(light);

        remote.setSlot(lightOn);
        remote.buttonWasPressed();

        GarageDoor garageDoor = new GarageDoor("");
        GarageDoorUpCommand doorOpen = new GarageDoorUpCommand(garageDoor);

        remote.setSlot(doorOpen);
        remote.buttonWasPressed();
    }
}
