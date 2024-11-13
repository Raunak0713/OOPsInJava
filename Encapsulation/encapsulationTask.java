package Encapsulation;

class BankAccount{
  private String accountHolderName;
  private double accountBalance;

  public BankAccount(String accountHolderName, double accountBalance){
    this.accountHolderName = accountHolderName;
    this.accountBalance = accountBalance;
  }

  public void deposit(double moneyIn){
    if(moneyIn < 0){
      System.out.println("Invalid Deposit Amount");
    }
    else{
      accountBalance += moneyIn;
    }
  }

  public void withdraw(double moneyOut){
    if(moneyOut < 0){
      System.out.println("You cant withdraw Negetive funds");
    }

    if(accountBalance - moneyOut < 0){
      System.out.println("Insufficient Funds");
    }
    else{
      accountBalance -= moneyOut;
    }
  }

  public double getAccountBalance(){
    return accountBalance;
  }

  public String getAccountHolderName(){
    return accountHolderName;
  }
  public void setAccountHolderName(String name){
    this.accountHolderName = name;
  }

  public void displayAccountInfo(){
    System.out.println("Name : " + accountHolderName);
    System.out.println("Account Balance : " + accountBalance);
  }
}

public class encapsulationTask{
  public static void main(String[] args) {
    BankAccount ba = new BankAccount("Raunak", 10000);
    ba.displayAccountInfo();

    ba.deposit(2000);
    ba.displayAccountInfo();

    ba.withdraw(13000);
    ba.displayAccountInfo();

    ba.deposit(-1000);
    ba.displayAccountInfo();
  }
}