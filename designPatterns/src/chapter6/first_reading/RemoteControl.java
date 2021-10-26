package chapter6.first_reading;

public class RemoteControl {
    /**
     * 이 리모컨 코드에서는 일곱 개의 On, Off 명령을 처리할 수 있습니다.
     * 각 명령은 배열에 저장됩니다.
     */
    Command[] onCommands;
    Command[] offCommands;

    /**
     * 생성자에서는 각 On, Off 배열의 인스턴를 만들고 초기화하기만 하면 됩니다.
     */
    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    /**
     * 슬롯 번호와 그 슬롯에 저정할 on 및 off 명령을 인자로 전달 받습니다. 각 커멘드 객체를 나중에
     * 사용할 수 있도록 배열에 저장합니다.
     */

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    /**
     * 사용자가 On 또는 Off 버튼을 누르면 리모컨 하드웨어에서 각 버튼에 대응되는
     * onButtonWasPush 또는 offButtonWasPushed 메소드를 호출합니다.
     *
     */

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }
    
    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                    + "    " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }

}
