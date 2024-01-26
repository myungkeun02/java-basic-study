package poly.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Caw(), new Duck()};
        sounds(animals);
    }

    private static void sounds(Animal[] animals) {
        for(Animal animal : animals) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
        }
    }
}
