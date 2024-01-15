package oop1.ex;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();
        account.balance = 10000;
        account.deposit(1000);
        account.withdraw(10000);
        account.withdraw(10000);
    }
}
