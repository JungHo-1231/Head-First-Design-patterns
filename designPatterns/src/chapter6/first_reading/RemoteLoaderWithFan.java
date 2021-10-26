package chapter6.first_reading;

public class RemoteLoaderWithFan  {
    public static void main(String[] args) {
        RemoteControllerWithUndo remoteControl = new RemoteControllerWithUndo();

        CeilingFan ceilingFan = new CeilingFan("Living Room");

        CeilingFanWithMediumCommand ceilingFanWithMedium = new CeilingFanWithMediumCommand(ceilingFan);
        CeilingFanWithHighCommand ceilingFanWithHigh= new CeilingFanWithHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff= new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0, ceilingFanWithMedium, ceilingFanOff);
        remoteControl.setCommand(1, ceilingFanWithHigh, ceilingFanOff) ;

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
    }
}
