package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10; // NullPointerException 예외 발생
        System.out.println("data.value = " + data.value);
    }
}
// data가 null 값이라 참조값이 없는 변수인데 그 값에 .value를 하여 값을 호출하였기 떄문에 (없는 인스턴스를 호출했기떄)
// 가져올수가 없다. 그렇기에 이 코드를 실행하면 NullPointerException 예외가 발생하여 코드가 실행되지 않는다.