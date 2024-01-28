package poly.ex.sender.pay0;

public class PayMain0 {
    public static void main(String[] args) {
        PayService payService = new PayService();
        payService.processPay("naver", 10000);
        payService.processPay("kakao", 10000);
        payService.processPay("toss", 10000);
    }
}
