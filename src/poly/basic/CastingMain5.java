package poly.basic;

public class CastingMain5 {
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
        if(parent instanceof Child) { // parent 인스턴스가 Child 인스턴스일경우
            System.out.println("Child 인스턴스 맞음");
            Child child = (Child) parent;
            child.childMethod();
        }
    }
}