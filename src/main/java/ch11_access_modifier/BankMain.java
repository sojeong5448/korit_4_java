package ch11_access_modifier;

public class BankMain {
    public static void main(String[] args) {
        Bank account1 = new Bank(123456, "홍길동", 100000, 1234);
        account1.deposit(50000, 123);
        account1.deposit(50000, 1234);
        account1.withdraw(200000, 1234);
        account1.withdraw(100000, 1234);



        Bank account2 = new Bank(987654, "신사임당", 500000, 123);
        account2.withdraw(100000, 123);
        account2.withdraw(0, 123);
        account2.deposit(200000, 123);
        account2.deposit(0, 123);

        account1.showAccountInfo();
        account2.showAccountInfo();

        account1.displayInfo();
        account2.displayInfo();

        Bank account3 = new Bank(1234, "dsf", 500000);
        account3.setPin("10000");
        account3.setPin("-1");
        account3.setPin("452");
        account3.setPin("-125");
        account3.setPin("1234");

    }
}
