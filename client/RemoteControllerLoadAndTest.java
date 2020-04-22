package local.com.client;

import local.com.Command;
import local.com.concrete.RemoteController;
import local.com.receiver.*;

public class RemoteControllerLoadAndTest {
    public static void main(String[] args){
        RemoteController remoteController = new RemoteController();

        LightAction livingRoomLight = new LightAction("livingRoom");
        LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);

        LightAction kitchenRoomLight = new LightAction("kitchenRoom");
        LightOnCommand kitchenRoomLightOnCommand = new LightOnCommand(kitchenRoomLight);

        GarageAction garageAction = new GarageAction();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageAction);

        CellingFan cellingFan = new CellingFan("livingRomm", 0);
        CellingFanHighCommand cellingFanHighCommand = new CellingFanHighCommand(cellingFan);

        Command[] commands = new Command[]{livingRoomLightOnCommand, garageDoorOpenCommand, cellingFanHighCommand};
        MacroCommand macroOnCommand = new MacroCommand(commands);

        remoteController.setCommand(0, livingRoomLightOnCommand, null);
        remoteController.setCommand(1, kitchenRoomLightOnCommand, null);
        remoteController.setCommand(2, garageDoorOpenCommand, null);
        remoteController.setCommand(3, cellingFanHighCommand, null);
        remoteController.setCommand(4, macroOnCommand, null);

        //System.out.println(remoteController.toString());

        remoteController.pressOnButton(4);
        //remoteController.undo();
        //remoteController.undo();

    }
}
