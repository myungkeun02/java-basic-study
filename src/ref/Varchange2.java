package ref;

public class Varchange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA; // 자바에서 대입은 값을 복사하는것! 여기서 복사하는 값은 참조값 즉, dataA의 주소를 복사하는것이기떄문에

        System.out.println("dataA 참조값 :" + dataA);
        System.out.println("dataB 참조값 :" + dataB);
        System.out.println("dataA.value :" + dataA.value);
        System.out.println("dataB.value :" + dataB.value);

        //data A 변경
        dataA.value = 20; // 여기서 dataA.value 를 변경하면 같은 참조값을 가진 dataB.value 도 변경된다.
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value :" + dataA.value);
        System.out.println("dataB.value :" + dataB.value);

        //data B 변경
        dataB.value = 30; // 여기서 dataB.value 를 변경하면 같은 참조값을 가진 dataA.value 도 변경된다.
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA.value :" + dataA.value);
        System.out.println("dataB.value :" + dataB.value);
    }
}


// 여기서의 핵심은 dataA를 복사하여 dataB를 만들떄 새로운 인스턴스를 생성하는것이 아닌, 같은 인스턴스의 참조값 (주소)를 복사한다는것이다.
// 결국 위 과정을 거쳐도 Data 클래를 이용해 생성이 된 인스턴스는 하나 뿐잇것이다. (ref.Data@30f39991)