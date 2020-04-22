package local.com;

public class NoCommand implements Command {
    public void execute() {
        System.out.println("no command");
    }

    public void undo() {

    }
}
