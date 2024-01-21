package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data(); // 참조형
//        data = new Data(); data라는 변수에 담긴 참조값 (주소)는 변경이 불가능하다
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
//        여기서 data 라는 변수에 초기화된 참조값은 변경이 불가능하지만 해당 인스턴스 내부에 있는
//        멤버변수 value 에는 final 이 붙어있지 않기떄문에 값을 원하는대로 변경이 가능하다. 매우 헷갈리기 쉬우니 주의하자
    }
}
