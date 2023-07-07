package bank.Application;

import java.util.UUID;

public class SBI implements bankInterface{

    private int balance;

    public static int interest;
    private int password;
    private String AccNo;
    private String uname;

    SBI(int balance, String uname,int password){
        this.balance = balance;
        this.AccNo = UUID.randomUUID().toString();
        this.uname = uname;
        this.password = password;
    }

    @Override
    public int getBalance(int password) {
        if(this.password==password){
            return balance;
        }

//        return 0;
        System.out.println("wrong password");
        return -1;

    }

    @Override
    public String getAccNo(int password) {
        if(this.password==password){
            return "Hi, "+this.uname+" your acc no is "+ AccNo;
        }

//        return 0;
//        System.out.println("wrong password");
        return "wrong password bro";
    }

    @Override
    public String changePassword(int currPass, int newPass) {
        if(this.password==currPass){
            password = newPass;
            return "password updated";
        }

        return "current password is wrong, so password is not updated";
    }

    @Override
    public String addMoney(int password, int moneyAdd) {
        if(this.password==password){
            balance += moneyAdd;
            return "money added successfully";
        }
        return "wrong password broooooo, so money not added";
    }

    @Override
    public String withDrawMoney(int password, int withDrawMoney) {
        if(this.password==password){


            if(this.balance<withDrawMoney){
                return "insufficient money";
            }
            balance -= withDrawMoney;
            return "money withdrawn successfully";
        }
        return "wrong password broooooo, so money not withdrawn";
    }

    @Override
    public String rateOfInterest(int years) {
        double val = (years * balance * interest ) / 100;
        return "your interest for "+years+" years is "+ val;
    }
}
