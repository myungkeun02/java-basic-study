package access.b;

//import access.a.DefaultClass1;
//import access.a.DefaultClass2;
import access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
//        DefaultClass1 class1 = new DefaultClass1(); // 접근제어자가 default 로 설정이 되어있어 외부패키지인 B에 있는 클래스에서는 호출이 불가능하다
//        DefaultClass2 class2 = new DefaultClass2(); // 접근제어자가 default 로 설정이 되어있어 외부패키지인 B에 있는 클래스에서는 호출이 불가능하다
    }
}
