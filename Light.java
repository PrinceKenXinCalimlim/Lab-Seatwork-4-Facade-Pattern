public class Light implements HomeService{

    @Override
    public void turnOn() {
        System.out.println("The Lights are Switched On!");
    }
    @Override
    public void turnOff() {
        System.out.println("The Lights are Switched Off!");
    }
}