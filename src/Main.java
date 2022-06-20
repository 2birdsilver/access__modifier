import com.sun.xml.internal.ws.api.client.SelectOptimalEncodingFeature;

public class Main {
    public static void main(String[] args) {
        // 사람 선언

        Person p2 = new Person();
        p2.setName("이세은");
        p2.setAge(29);
        p2.setCashAmount(100000);

        // 은행 계좌 생성

        BankAccount a2 = new BankAccount();
        a2.setBalance(500000);

        a2.setOwner(p2);
        p2.setAccount(a2);

        System.out.println(a2.deposit(30000));
        System.out.println(a2.withdraw(170000));
        System.out.println(a2.deposit(620000));
        System.out.println(a2.withdraw(890000));


    }
}