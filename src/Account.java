public class Account {
    private String name;
    private double balance;
    private String Number;
    private String Email;
    private  String phoneNo;


    public Account(String name, double balance, String Number, String email, String phoneNo ){
        this.name = name;
        this.balance = balance;
        this.Number = Number;
        this.Email = email;
        this.phoneNo = phoneNo;
    }

    public  void DepositeMoney(double DepositedMoney) {
        this.balance += DepositedMoney;
        System.out.println("Deposite is succesful, new balance is " + this.balance);
    }

    public void WithDraw(double WithdrawlMoney){
        if(this.balance-WithdrawlMoney<0){
            System.out.println("Withdraw Unsuccesfull "+ this.balance+ "is left");
        }else{
            this.balance-=WithdrawlMoney;
            System.out.println("withdraw succesfull");
            System.out.println(this.balance);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }


    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}
