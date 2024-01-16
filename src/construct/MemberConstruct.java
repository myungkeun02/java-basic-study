package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name=" + name + ",age=" + age + ",grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    //추가
    MemberConstruct(String name, int age) {
        this(name, age, 50); // - > this를 이용해 해당 인스턴스의 다른 생성자를 호출하는 과정이다.
    }
}

// 위 인스턴스와 같은 메서드 형태가 생성자 construct 이다.
// this() 를 사용하면 생성자 내부에서 다른 생성자를 호출할수있다.
// 이 부분을 잘 활용하면 지금과 같이 중복을 제거할수있다.
// 이떄 중요한점은 this()는 생성자 코드의 첫줄에만 작성할수있다는것이다.
