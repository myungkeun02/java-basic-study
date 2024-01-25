package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        // 부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        // 자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        //  부모 변수가 자식 인스턴스 참조 (다형성 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();
        // Child 인스턴스를 생성하면 부모인 Parent 도 같은 참조값에 동시에 생성이 된다.
        // 이떄 poly 의 타입을 Parent 로 지정을 했기 떄문에, poly 는 parentMethod 만 호출할수있게 된다.
        // Child child1 = new Parent();
        // 위는 불가능 Parent 인스턴스를 생성한다고 자식인 Child 는 생성되지 않기 떄문
    }
}
