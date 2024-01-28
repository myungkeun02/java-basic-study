package poly.car1;

public class Tucson implements Car{
    @Override
    public void startEngine() {
        System.out.println("Tucson.startEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("Tucson.offEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("Tucson.pressAccelerator");
    }
}
