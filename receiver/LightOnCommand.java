package local.com.receiver;

import local.com.Command;

public class LightOnCommand implements Command {

    private LightAction lightAction;

    public LightOnCommand(LightAction lightAction){
        this.lightAction = lightAction;
    }

    public void execute() {
        lightAction.on();
    }

    public void undo() {
        lightAction.off();
    }
}
