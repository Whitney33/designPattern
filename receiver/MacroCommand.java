package local.com.receiver;

import local.com.Command;

public class MacroCommand implements Command {
    private Command[] commands;

    public MacroCommand(Command[] commands){
        this.commands = commands;
    }

    public void execute() {
        if(null == commands){
            return ;
        }
        for(Command command : commands){
            command.execute();
        }
    }

    public void undo() {
        if(null == commands){
            return ;
        }
        for(Command command : commands){
            command.undo();
        }
    }
}
