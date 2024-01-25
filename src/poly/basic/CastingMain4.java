package poly.basic;

public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod(); // 문제 없음

        Parent parent2 = new Parent();
        Child child2 = (Child) parent2; // 런타입 오류 ClassCastException
        child2.childMethod(); // 실행 불가

        // parent2 는 Parent인스턴스를 생성한것 그렇기 떄문에 parent의 주소의 메모리에는 child가 없기 때문에 child를 참조할수없다
    }
}
// 업캐팅의 경우 객체를 생성할때 해당타입의 상위 부모타입도 동시에 생성되기 떄문에 문제가 발생하지 않는다.
// 반면에 다운캐스팅의 경우 인스턴스에 존재하지않는 하위 타입으로 캐스팅하는 문제가 발생할 수 있다.
// 객체를 생성하면 부모타입은 모두 함꼐 생성되지만 자식타입은 생성되지않기 떄무이다.
// 그렇기 떄문에 개발자는 문제를 인지하고 사용해야한다는 의미로 명시적으로 캐스팅을 해주어야한다.
// (업캐스팅은 캐스팅을 생략하여도 무방하다 오히려 권장함)