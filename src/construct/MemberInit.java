package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    void initMember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
// 여기서 this 를 사용하는 이유!! (매개변수와 멤버변수의 이름이 같은경우)
// this를 사용하지 않고 name = name <- 이런식으로 코드를 작성하게 되면
// 변수 특성상 호출하는 스코프 내부의 변수를 호출하게 되어 매개변수로 받아오는 name을 호출하게되어
// 매개변수 name = 매개변수 name 이라는 의미없는 코드가 작성된다.
// 이떄 this.name <- 이렇게 작성하면, this 가 가리키는 곳은 메서드 바깥쪽에 위치한 name 즉 MemberInit 인스턴스의 멤버변수인 name을 호출할수있게 된다.
