package chapter6.first_reading;

public class RemoteLoader {
    public static void main(String[] args) {
//        RemoteControl remoteControl = new RemoteControl();
        RemoteControllerWithUndo remoteControl = new RemoteControllerWithUndo();

        /** 각 장치들을 설치합니다. 위치도 적절하게 설정해 줍니다. */
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");

        /** 각 전등용 커맨드 객체 */
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        /** 선풍기를 켜고 끄기 위한 커멘드 객체 */
        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        /** 차고 문을 열고 닫기 위한 커맨드 객체 */
        GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDownCommand = new GarageDoorDownCommand(garageDoor);

        /** 오디오를 켜고 끄기 위한 커맨드 객체 */
        StereoOnWithCDCommand stereoOnWithCd = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffWithCd = new StereoOffCommand(stereo);

        /** 커멘드가 준비되었으니 리모컨 슬롯에 각 커맨드를 로드합니다. */
        remoteControl.setCommand(0, livingRoomLightOn , livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
        remoteControl.setCommand(3, stereoOnWithCd, stereoOffWithCd);

        /** toString() 메소드를 써서 각 리모컨 슬롯에 대한 정보를 출력합니다. */
        System.out.println(remoteControl);

        /** 각 슬롯을 켰다가 꺼 봅시다. */
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);

        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);

        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);

        remoteControl.undoButtonWasPushed();

    }
}
