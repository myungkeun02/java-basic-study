package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        staticValue++; // static 변수 접근가능
        staticMethod(); // static 메소드 접근가능
//         instanceMethod(); instance 메소드 접근 불가
//        instanceValue++; instance 변수 접근 불가
        // 위 예시가 접근이 불가능한 이유는 인스턴스 변수는 인스턴스를 생성해야 접근이 가능한데
        // 스태틱 메소드는 인스턴스 생성없이 호출하기 때문이다
    }
    public void instanceCall() {
        instanceValue++;
        staticValue++;
        instanceMethod();
        staticMethod();
        // 위 상황에선 모두 접근이 가능하다 그 이유는 인스턴스변수는 인스턴스를 생성하여 접근을 하는데 생성된 인스턴스 안의
        // 멤버 변수와 멤버 메서드에 위 4가지가 모두 있기 때문이다 (static 여부와 관계 없다)
    }
    public void instanceMethod (){
        System.out.println("instanceValue = " + instanceValue);
    }

    public static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }

}
