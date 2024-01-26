package poly.ex6;

public class AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        moveAnimal(dog);
        soundAnimal(dog);
//        flyAnimal(dog); interface 설정이 되어있지 않아 에러발생
        System.out.println("=====================");
        moveAnimal(bird); // 기본설정값이 출력됨
        flyAnimal(bird);
        soundAnimal(bird);
        System.out.println("=====================");
        moveAnimal(chicken); // 기본설정값이 출력됨
        flyAnimal(chicken);
        soundAnimal(chicken);

    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        animal.move();
        System.out.println("동물 소리 테스트 종료");
    }
    private static void flyAnimal(Fly fly) {
        System.out.println("날기 테스트 시작");
        fly.fly();
        System.out.println("날기 테스트 종료");
    }
    private static void moveAnimal(AbstractAnimal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("동물 이동 테스트 종료");
    }

}
