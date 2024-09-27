public class AirConditioning implements HomeService {

    @Override
    public void turnOn(){
        System.out.println("Air Conditioning is Turned-on!");
    }
    @Override
    public void turnOff(){
        System.out.println("Air Conditioning is Turned-off!");
    }
}