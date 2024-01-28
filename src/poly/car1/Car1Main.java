package poly.car1;

public class Car1Main {
    public static void main(String[] args) {
        Driver driver = new Driver();
        System.out.println("========차량변경========");
        K3Car k3Car = new K3Car();
        driver.setCar(k3Car);
        driver.drive();
        System.out.println("========차량변경========");
        Model3Car model3Car = new Model3Car();
        driver.setCar(model3Car);
        driver.drive();
        System.out.println("========차량변경========");
        Tucson tucson = new Tucson();
        driver.setCar(tucson);
        driver.drive();
    }
}
