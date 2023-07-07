package bank.Application;

public interface bankInterface {

    public int getBalance(int password);
    public String getAccNo(int password);

    public String changePassword(int currPass, int newPass);

//    public String getPassword(int uname);

    public String addMoney(int password, int moneyAdd);

    public String withDrawMoney(int password, int withDrawMoney);


    public String rateOfInterest(int years);
}
