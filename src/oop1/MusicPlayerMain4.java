package oop1;

public class MusicPlayerMain4 {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        // 켜기
        player.on();
        // 볼륨 키우기
        player.volumeUp();
        // 볼륨 키우기
        player.volumeUp();
        // 볼륨 줄이기
        player.volumeDown();
        // 상태 확인
        player.showStatus();
        // 끄기
        player.off();
    }
}

// musicPlayer을 보면 음악 플레이를 구성하기 위한 속성과 기능이 마치 하나의 캡슐에 쌓여있는 것 같다. 이렇게 속성과 기능을 하나로 묶어서 필요한 기능을
// 메서드를 통해 외부에게 제공하는 것을 캡술화 라고 한다

// 개겣 지향 프로그래밍 덕분에 음악플레이어 객체를 사용하는 입장에서 진짜 음악 플레이어를 만들고 사용하는 것 처럼 친숙하게 느껴진다.
// 그래서 코드가 더 읽기 쉬운것은 물론이고 ,속성과 기능이 한 곳에 있기 떄문에 변경도 더 쉬워진다.
// 예를 들어 volume 이라는 필드명을 변경한다고 할떄 musicPlayer 내부만 변경하면 된다. 또 음악 플레이엉 내부에서 출력하는 메세지를 변경할 때도
// musicPlayer 내부만 변경하면 된다. 이 경우 musicPlayer을 사용하는 개발자는 코드를 전혀 변경하지 않아도 된다.
// 물론 외부에서 호출하는 musicPlayer의 메서드 이름을 변경한다면 musicPlayer를 사용하는 곳의 코드도 변경해야한다.

// 여기서 알 수 있는 가장 중요한 객체지향 프로그래밍의 특징은 멤버변수와 메서드가 하나의 클래스에 묶여서 캡술화가 되어있다는 것이다.