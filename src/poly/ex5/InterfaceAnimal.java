package poly.ex5;

public interface InterfaceAnimal {
    void sound(); // public abstract
    void move(); // public abstract
}

// interface 는 상속이 아닌 구현이라고 표현한다.
// interface 의 모든 method 는 추상 method 이기 떄문에
// 자식 클래스에서 모든 부모의 method 구현해주어야 하기 때문이다.
// 자식아.. 내가 설계도를 줄테니 method 만들어서 써라.... 내가 니 method 까지 만들어 줘야하냐 ...;;

// interface 를 사용해야 하는 이유
// 제약: interface 를 구현하는 곳에서 interface 의 메서드를 반드시 구현하라는 제약을 주는것
//      또한 순수 추상 class 의 경우 그곳에 일반 method 를 포함 시킬수 있는데
//      이렇게 되면 더 이상 순수 추상 class 의 역할을 할 수 없기 떄문에 interface 로 생성을 하여 이런 문제를 원천 차단할 수 있다.
// 다중구현: Java 에선 Class 상속은 부모를 하나만 지정할 수 있다.
// 반면에 interface 는 부모를 여러면 두는 다중 구현(다중 상속)이 가능하다!! 엄청난 이득