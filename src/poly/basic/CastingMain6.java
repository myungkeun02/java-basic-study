package poly.basic;

public class CastingMain6 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parnet1 호출");
        call(parent1);
        Parent parent2 = new Child();
        System.out.println("parnet2 호출");
        call(parent2);

    }

    private static void call(Parent parent) {
        parent.parentMethod();
        // Child 인스턴스인 경우 childMethod()실행 (java16부터는 instanceof를 함과 동시에 다운캐스팅을 할 수 있음)
        if(parent instanceof Child child) { // parent 인스턴스가 Child 인스턴스일경우
            System.out.println("Child 인스턴스 맞음");
            child.childMethod();
        }
    }
}