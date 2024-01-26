package poly.ex4;

public abstract class AbstractAnimal {
    public abstract void sound();

    public abstract void move ();
}

// 위 class 는 순수 추상 class 이다.
// 인스턴스를 생성할 수 없고, 상속시 자식은 모든 method 를 overriding 해야하며, 주로 다형성을 위해 사용된다.
// 순수 추상 class 는 마치 interface 를 보는것 같다..!!
// java는 순수 추상 class 를 편리하게 사용하기 위해 interface 라는 개념을 제공한다.