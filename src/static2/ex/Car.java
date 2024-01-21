package static2.ex;

public class Car {

    private static int total = 0;
    private String name;
    public Car(String name) {
        System.out.println("차량구입, 이름: " + name);
        this.name = name;
        total++;
    }

    public static void showTotalCars(){
        System.out.println("구매한 차량 수 :" + total);
    }

}
