package poly.ex3;

public abstract class AbstractAnimal { // abstract 를 이용해 추상 클래스로 선언 (바디에 추상메서드가 하나라도 있으면 클래스도 추상 클래스로 선언해야함)
    public abstract void sound(); // 자식클래스가 반드시 오버라이딩 해야하는 메서드를 추상 메서드로 선언한다. 이떄 메서드 바디는 없어야 한다.
    // sound 메서드는 자식 AbstractAnimal 의 자식 클래스에서 반드시 오버라이딩 해야한다.

    public void move () {
        System.out.println("동물이 움직입니다."); // 자식이 상속받아 사용하는 목적
    }
}
