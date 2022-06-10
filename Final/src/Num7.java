interface RemoteControl{
    void turnOn();
    void turnOff();
}

public class Num7 {
    public static void main(String[] args) {
        RemoteControl rc = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("Turned on");
            }

            @Override
            public void turnOff() {
                System.out.println("Turned off");
            }
        };
        rc.turnOn();
        rc.turnOff();
    }
}
