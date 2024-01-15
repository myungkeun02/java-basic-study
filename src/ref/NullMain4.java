package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data(); // data 인스턴스 생성
        System.out.println("bigData.count = " + bigData.count); // 초기값 null -> 0출력
        System.out.println("bigData.data = " + bigData.data); // 초기값 null -> null 출력


        System.out.println("bigData.data.value = " + bigData.data.value); // 위에서 data의 인스턴스를 생성했기떄문에 자동으로 0으로 초기화되어 0이 출력
    }
}


// 최종정리
// NullPointerException 예외가 발생하면 null 값에 .(dot)를 찍었다고 생각하면 문제를 쉽게 찾을 수 있다.