package local.com.concrete;

import local.com.Command;
import local.com.NoCommand;

import java.util.Arrays;

/**
 * 当有新的厂商动作产生时，遥控器不需要进行变动，实现解耦
 */
public class RemoteController {
    private Command[] onCommands = new Command[7];
    private Command[] offCommands = new Command[7];
    private Command undoCommang;


    Command noCommand = new NoCommand();
    public RemoteController(){
        Arrays.fill(onCommands, noCommand);
        Arrays.fill(offCommands, noCommand);
        undoCommang = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = (onCommand == null ? noCommand : onCommand);
        offCommands[slot] = (offCommand == null ? noCommand : offCommand);
    }

    @Override
    public String toString() {
        String commandResult = "-------Remote Controller init start--------" + "\r\n";
        for(int i = 0; i < onCommands.length; i++){
            commandResult = commandResult.concat("slot" + i).concat(" : ")
                    .concat(onCommands[i].getClass().getSimpleName())
                    .concat(",")
                    .concat(offCommands[i].getClass().getSimpleName())
                    .concat("\r\n");
        }
        commandResult = commandResult.concat("-------Remote Controller init end--------").concat("\r\n");
        return commandResult;
    }

    public void pressOnButton(int i){
        onCommands[i].execute();
        undoCommang = onCommands[i];
    }
    public void pressOffButton(int i){
        offCommands[i].execute();
        undoCommang = onCommands[i];
    }

    public void undo(){
        System.out.println("undo: ");
        undoCommang.undo();
    }
}
