package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println ("메서드 호출 전: dataA.value : " + dataA.value);
        changeReference(dataA); // 여기서 전달하는 dataA는 dataA의 참조값 즉 주소이다.

        System.out.println ("메서드 호출 후: dataA.value : " + dataA.value);

    }
    public static void changeReference(Data dataX){
        dataX.value = 20; // 여기서 변경하는 값은 전달받은 dataA의 참조값이다.
    }
}

// 이 코드에서 알 수 있는것은.
// 참조형 변수가 메서드에 호출 되는 과정에서 별도의 리턴값이 없어도 필드값이 변경될수있다는것이다.
// 그 이유는 매개변수로 전달하는 dataA가 가진 값은 dataA의 참조값 즉 주소이기 때문이다.
// 그렇기 떄문에 changeReference에서 인자로 받아온 dataX는 dataA의 참조값 (주소)이기때문에 dataA.value의 값이 바뀔수있다.
// 결국 위 코드에서도 생성된 인스턴스는 dataA에 대입된 참조값 하나이다.
