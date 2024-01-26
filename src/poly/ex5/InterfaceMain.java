package poly.ex5;

public class InterfaceMain {
    public static void main(String[] args) {
//        InterfaceAnimal interfaceAnimal = new InterfaceAnimal(); interface 생성 불가

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        soundAnimal(dog);
        moveAnimal(dog);
        soundAnimal(cat);
        moveAnimal(cat);
        soundAnimal(caw);
        moveAnimal(caw);

    }
    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    private static void moveAnimal(InterfaceAnimal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("동물 이동 테스트 종료");
    }
}
