package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeDown();
        speaker.showVolume();

        //필드에 직접 접근
        System.out.println("volume 멤버변수 직접 접근 수정");
//        speaker.volume = 200;  <- volume 멤버변수에 private 부여로 외부 클래스에서 해당 변수의 값을 변경할수없기에 컴파일 에러가 발생한다.
        speaker.showVolume();
    }
}

// Speaker 객체를 사용하는 사용자는 Speaker 의 volume 멤버변수와 메서드에 모두 접근할수있다.
// 앞서 volumeup()과 같은 메서드를 만들어서 음량이 100을 넘지 못하도록 기능을 개발했지만 소용이 없다.

// 이런 문제를 근복적으로 해결하기 위해서는 volume 멤버변수의 외부 접근을 막을수 있는 방법이 필요하다.

// 이떄 사용하는 접근제어자가 private 이다. Speaker 클래스 내부의 volume 멤버 변수 선언시
//  private int volume; <- 이런식으로 선언하게 되면 volume 멤버 변수는 선언된 클래스 내부에서만 값을 변경할수있다.

// 좋은 프로그램은 무한한 자유도가 주어진 프로그램이 아니라 적절한 제약을 제공하는 프로그램이다.