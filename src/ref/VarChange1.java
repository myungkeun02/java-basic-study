package ref;

public class VarChange1 {
    public static void main(String[] args) {
        int a = 10;
        int b = a; // a의 값만을 복사하여 b에 대입

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = 20; // a와 b의 값은 전혀 다른 존재
        System.out.println("변경 a = 20");
        System.out.println("a = " + a);
        System.out.println("b = " + b); // b에 변화 없음

        b = 30; // a와 b의 값은 전혀 다른 존재
        System.out.println("변경 b = 30");
        System.out.println("a = " + a); // a에 변화 없음
        System.out.println("b = " + b);
    }
}
