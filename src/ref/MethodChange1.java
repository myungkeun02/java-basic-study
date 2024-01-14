package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출전 : a = " + a);
        changePrimitive(a); // 메소드의 매개변수로 전달한 a는 값을 복사하는것 즉 10 이라는 숫자를 복사하여 매개변수로 전달한것
        System.out.println("메서드 호출후 : a = " + a);
    }

    public static void changePrimitive(int x) {
        x = 20; // 리턴되는값이 없이 받은 인자를 20으로 변경 하지만 리턴되는 값이 없기떄무에 아무런 결과물이 나오지 않는다.
    }
}

// 선언된 변수를 메서드의 매개변수로 전달할떄에도 변수가 가진 값을 복사하는것이다.
// 그말은 즉 위 코드에서 a를 changePrimitive의 매개변수로 전달할때 전달되는 값이라는 10이라는 int형 값 이다.
