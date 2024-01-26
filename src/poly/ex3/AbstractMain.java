package poly.ex3;

public class AbstractMain {
    public static void main(String[] args) {
        // 추상클래스는 생성 불가능
//        AbstractAnimal animal = new AbstractAnimal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);

    }
    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}

// abstract class 덕분에 실수로 Animal instance 를 생성할 문제를 근본적으로 방지해준다.
// abstract method 덕분에 새로운 동물의 자식 class 를 만들때 실수로 sound()를 overriding 하지 않을 문제를 근본적으로 방지해 준다
// 좋은 프로그램은 적절한 제약이 있는 프로그램이라는것을 꼭 기억하자!!