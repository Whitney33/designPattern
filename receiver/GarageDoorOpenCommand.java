package local.com.receiver;

import local.com.Command;

public class GarageDoorOpenCommand implements Command {

    private GarageAction garageAction;

    public GarageDoorOpenCommand(GarageAction garageAction){
        this.garageAction = garageAction;
    }

    public void execute() {
        garageAction.open();
    }

    public void undo() {
        garageAction.close();
    }
}
