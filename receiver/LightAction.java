package local.com.receiver;

public class LightAction {

    private String location;

    public LightAction(String location){
        this.location = location;
    }

    public void on(){
        System.out.println(location + " turn on light");
    }
    public void off(){
        System.out.println(location + " turn off light");
    }
}
