 package poly.ex.sender.pay1;

import poly.ex.sender.pay0.PayService;

public class PayMain1 {
    public static void main(String[] args) {
        PayService payService = new PayService();
        payService.processPay("naver", 10000);
        payService.processPay("kakao", 10000);
        payService.processPay("toss", 10000);
        payService.processPay("ss", 1000);

    }
}
