package access;

public class Speaker {
    //    int volume; // 잘못된 설정
    private int volume; // 올바른 설정

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100){
            System.out.println("최대 음량입니다.");
        } else {
            volume += 10;
            System.out.println("음량이 10 증가합니다.");
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("음량이 10 감소합니다");
    }

    void showVolume() {
        System.out.println("현재 음량 : " + volume);
    }
}
