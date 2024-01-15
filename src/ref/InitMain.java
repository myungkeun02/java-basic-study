package ref;

public class InitMain {
    public static void main(String[] args) {
        InitData data = new InitData();
        System.out.println("value1 = " + data.value1); // 멤버변수 선언시 초기화 하지 않아서 0으로 자동 초기화
        System.out.println("value2 = " + data.value2); // 멤버변수 선언시 10으로 초기화 하여 10으로 초기화
    }
}
