package poly.basic;

public class CastingMain3 {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = (Parent) child; // 업캐스팅 생략 가능, 생략권장
        Parent parent2 = child; // 업캐스팅 생략
        Child child1 = new Child();

        parent1.parentMethod();
        parent2.parentMethod();

    }
}