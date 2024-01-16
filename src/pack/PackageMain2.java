package pack;

import pack.a.User; // 메인 클래스와 같은 패키지가 아닌 외부 패키지에 존재한 클래스를 호출할떄 import를 하여 사용할수있다.
import pack.a.*; // a 패키지에 있는 모든 클래슬르 호출하는 방법이다.

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data();
        User user = new User();
    }
}
