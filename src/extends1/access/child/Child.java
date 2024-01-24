package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {
    public void call() {
        publicValue = 1; // 어디서든 호출 가능
        protectedValue = 1;  // 상속관계이거나 같은 패키지일떄 호출가능
//        defaultValue =1; // 같은 패키지 일떄 호출가능 현재 다른 패키지의 클래스이기에 호출 불가능
//        privateValue = 1 // 같은 클래스 일떄 호출가능 다른 클래스이기 떄문에 호출 불가능

        publicMethod(); // 어디서든 호출 가능
        protectedMethod(); // 상속관계이거나 같은 패키지일떄 호출 가능
//        defaultMethod(); // 같은 패키지 일떄 호출 가능 현재 다른 패키지의 클래스 이기에 호출 불가능
//        privateMethod(); // 같은 클래스일 때 호출 가능 다른 클래스이기 떄문에 호출 불가

        printParent(); // 어디서든 호출 가능 현재 내부에 모든 밸류와 메서드가 호출 되어 있는데 printParent 메서드는 parent 클래스 내부에 있기떄문에 모든 메서드와 밸류가 호출이 가능하다
    }


}
