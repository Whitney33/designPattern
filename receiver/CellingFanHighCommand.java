package local.com.receiver;

import local.com.Command;

public class CellingFanHighCommand implements Command {

    private CellingFan cellingFan;
    private Integer preSpeed;

    public CellingFanHighCommand(CellingFan cellingFan){
        this.cellingFan = cellingFan;
    }

    public void execute() {
        preSpeed = cellingFan.getSpeed();
        cellingFan.high();
    }

    public void undo() {
        if(CellingFan.MEDIUM.equals(preSpeed)){
            cellingFan.medium();
        }
        if(CellingFan.LOW.equals(preSpeed)){
            cellingFan.low();
        }
        if(CellingFan.OFF.equals(preSpeed)){
            cellingFan.off();
        }

    }
}
