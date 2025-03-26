package cars;

public class Car{

    private String name;

    public Car(String name){
        this.name = name;
    }

    public void beep(){
        System.out.println("Beep");
    }

    public String toString(){
        return "I am a " + name + ".";
    }
}