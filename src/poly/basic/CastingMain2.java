package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        // 부모변수가 자식 인스턴스 참조(다형성 참조)
        Parent poly = new Child();
        // 단 자식의 기능은 호출할 수 없다. 컴파일 오류 발생
        // poly.childMethod();

        // 다운 캐스팅 (부모타입 -> 자식타입)
        Child child = (Child) poly;
        child.childMethod();
        child.parentMethod();

        // 일시적 다운캐스팅 - 해당 메서드를 호출하는 순간 다운캐스팅
        ((Child) poly).childMethod(); // 한번만 다운캐스팅 하여 사용함

    }
}
