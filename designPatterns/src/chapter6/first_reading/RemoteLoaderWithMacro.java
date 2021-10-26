package chapter6.first_reading;

public class RemoteLoaderWithMacro {
    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light("Living Room");
        TV tv = new TV("Living Room");
        Stereo stereo = new Stereo("Living Room");
        Hottub hottub = new Hottub();

        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);

        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
        StereoOffWithCDCommand stereoOff= new StereoOffWithCDCommand(stereo);

        TVOnCommand tvOn = new TVOnCommand(tv);
        TvOffCommand tvOff= new TvOffCommand(tv);

        HottubOnCommand hottubOn = new HottubOnCommand(hottub);
        HottubOffCommand hottubOff= new HottubOffCommand(hottub);

        Command[] partyOn = {lightOn, stereoOn, tvOn ,hottubOn};
        Command[] partyOff = {lightOff, stereoOff, tvOff, hottubOff};

        MacroCommand partOnMacro= new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partOnMacro, partyOffMacro);
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);

    }
}
