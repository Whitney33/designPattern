package local.com;

public interface Command {
    void execute();

    void undo();
}
