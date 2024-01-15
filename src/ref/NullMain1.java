package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data);
        data = new Data(); // 참조값 생성
        System.out.println("2. data = " + data);
        data = null; // 위에서 생성한 참조값자리에 null을 넣어서 비어지게끔 만듬
        System.out.println("3. data = "+ data);
    }
}

// 위 코드에서 data = new Data(); 과정을 통해 생성되었던 참조값은 null을 대입함으로 더 이상 아무도 참조하지 않게되는데
// 이러면 메모리 공강에 자리만 차지하고 더이상 사용할수 없게 된다.
// 이떄 jvm의 gc(가비지 컬렉션)이 더 이상 사용하지 않는 인스턴를 자동으로 메모리에서 제거헤준다
