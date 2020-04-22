package local.com.receiver;

public class MacroAction {
    LightAction livingRoomLight = new LightAction("livingRoom");
    LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);

    LightAction kitchenRoomLight = new LightAction("kitchenRoom");
    LightOnCommand kitchenRoomLightOnCommand = new LightOnCommand(kitchenRoomLight);

    GarageAction garageAction = new GarageAction();
    GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageAction);

    CellingFan cellingFan = new CellingFan("livingRomm", 0);
    CellingFanHighCommand cellingFanHighCommand = new CellingFanHighCommand(cellingFan);
}
