package access.a;

public class AccessData {

    public int publicFiled;
    int defaultField;
    private int privateField;

    public void publicMethod() {
        System.out.println("publicMethod 호출 " + publicFiled);
    }

    void defaultMethod() {
        System.out.println("defaultMethod 호출 " + defaultField);
    }

    private void privateMethod() {
        System.out.println("privateMethod 호출" + privateField);
    }

    public void innerAccess() {
        System.out.println("내부호출");
        publicFiled = 100;
        defaultField = 200;
        privateField = 300;
        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
// 접근 제어자에는 4가지 종류가 있다.
// 1. public : 선언된 클래스 내부와 외부의 다른 모든 클래스에서 호출이 가능하다
// 2. default : package-private를 의미하며, 선언된 클래스가 위치한 패키지 내부의 클래스에서만 호출이 가능하다. (접근제어자를 명시하지 않으면 기본값으로 채택됨)
// 3. protected : 아직 다루지 않음 (상속관계에서는 호출이 가능하다.)
// 4. private : 선언된 클래스 내부에서만 호출이 가능하다.