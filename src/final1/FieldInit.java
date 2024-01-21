package final1;

public class FieldInit {
    static final int CONST_VALUE = 10;
    final int value = 10;
    // 인스턴스를 생성하여 접근하면 value의 값은 final 이기 떄문에 항상 10을 호출한다.
    // 이떄 메번 힙 영역에 새로운 참조값으로 10을 호출하게 되는데 이러면 메모리 낭비가 심해진다.
    //  그렇기 때문에 위에 작성한 fianl static을 함꼐 사용하는게 바람직하다.
//    public  FieldInit(int value) {
//        this.value = value; 컴파일 에러! 위에서 final int value = 10 으로 변수 초기화를 해놓아서 생성자로 값을 받을수 없다.
//    }
}
