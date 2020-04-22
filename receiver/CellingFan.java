package local.com.receiver;

public class CellingFan {
    public static Integer OFF = 0;
    public static Integer LOW = 1;
    public static Integer MEDIUM = 2;
    public static Integer HIGH = 3;

    String  location;
    Integer speed = 0;

    public CellingFan(String  location, Integer speed){
        this.location = location;
        this.speed = speed;
    }

    public void high(){
        this.speed = HIGH;
        System.out.println("cellingFan is working, speed is " + HIGH);
    }

    public void medium(){
        this.speed = MEDIUM;
        System.out.println("cellingFan is working, speed is " + MEDIUM);
    }

    public void low(){
        this.speed = LOW;
        System.out.println("cellingFan is working, speed is " + LOW);
    }

    public void off(){
        this.speed = OFF;
        System.out.println("cellingFan is stopped, speed is " + OFF);
    }

    public Integer getSpeed(){
        return speed;
    }
}
