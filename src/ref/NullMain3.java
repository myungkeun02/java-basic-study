package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count = " + bigData.count); // 초기값 null -> 0출력
        System.out.println("bigData.data = " + bigData.data); // 초기값 null -> null 출력

        System.out.println("bigData.data.value = " + bigData.data.value); // null인 값에서 value를 호출했기떄문에 NullPointerException 예외 발생
    }
}
