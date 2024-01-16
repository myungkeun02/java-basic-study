package construct;

public class MemberThis {
    String nameFiled;

    void initMember(String nameParameter) {
        nameFiled = nameParameter; // == this.nameFiled = nameParameter
    }
}

// 위 코드에서는 매개변수와 멤버변수의 이름이 다르기때문에 this 키워드를 굳이 사용하지 않아도 자동으로 생성된다
// 헷갈리기 싫으면 그냥 인스턴스 내부의 메서드에서 같은 인스턴스에 속해있는 멤버변수를 호출할떄 this. 키워드를 항상 사용하는 코딩 스타일도 사용할수있다.
// 하지만 요즘 ide가 발전하면서 다른 변수면 색으로 구분을 해주기때문에 굳이 그런 코딩스타일을 사용하지 않아도 된다.
