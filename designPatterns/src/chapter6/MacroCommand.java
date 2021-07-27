package chapter6;

public class MacroCommand implements Command {
    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }


    @Override
    public void execute() {

        /**
         * 리모컨에서 매크로를 실행시키면 각 커맨드를
         * 순서대로 실행시킵니다.
         */
        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
        }

    }

    @Override
    public void undo() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].undo();
        }
    }
}
