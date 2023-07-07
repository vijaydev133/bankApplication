package bank.Application;

public class main {
    public static void main(String[] args) {
        SBI.interest = 7;
        HDFC.interest = 6;
        bankInterface acc1 = new SBI(130000,"vijay",1234);
        bankInterface acc2 = new SBI(10000,"ajay",9876);
//        String acc1No = acc1.getAccNo(1234);
//        System.out.println(acc1No);

        String mes= acc2.withDrawMoney(9876,100000);
        System.out.println(mes);

        System.out.println(acc2.getBalance(9876));

        String mass = acc1.changePassword(1234,2345);

        System.out.println(mass);
        System.out.println(acc1.getBalance(2345));


        bankInterface acc3 = new HDFC(1200,"vj",6789);
        System.out.println(acc3.rateOfInterest(12));


        System.out.println(acc1.getAccNo(2345));
        System.out.println(acc2.getAccNo(9876));
        System.out.println(acc3.getAccNo(6789));
    }
}
