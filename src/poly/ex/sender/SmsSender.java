package poly.ex.sender;

public class SmsSender implements Sender{
    @Override
    public void senderMessage(String str) {
        System.out.println("SMS를 발송합니다 :"+ str);
    }
}
