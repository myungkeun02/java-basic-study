package pack;

import pack.a.User;


public class PackageMain3 {
    public static void main(String[] args) {
        Data data = new Data();
        User userA = new User();
        pack.b.User userB = new pack.b.User();
    }
}

// 위에서 User라는 클래스를 a패키지에서 import 했기떄문에 같은 클래스 이름을 가진 패키지 b의 User클래스는 수동으로 호출하여야한다.