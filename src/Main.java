// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      Account Acount1 = new Account("abhi", 12365,
              "12", "abhi@gmail.com", "1234567"
              );

        Account Acount2 = new Account("Ram", 5000,
                "11", "ram@gmail.com", "1234567"
        );

      Acount1.DepositeMoney(100);
      Acount1.WithDraw(2500);

      Acount2.DepositeMoney(1000);
      Acount2.WithDraw(1000);

      
    }
}







//customer name,cust account number
//cust emil,balance,phone num(these are fields)
//Deposite money , withdraw money(methods)