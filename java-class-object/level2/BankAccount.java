public class BankAccount {
    private String holder, accNo;
    private double balance;

    public BankAccount(String h,String a,double b){holder=h;accNo=a;balance=b;}
    public void deposit(double amt){balance+=amt;}
    public void withdraw(double amt){if(amt<=balance) balance-=amt; else System.out.println("Insufficient");}
    public void display(){System.out.println(holder+" | "+accNo+" | Balance: "+balance);}

    public static void main(String[] args) {
        BankAccount acc=new BankAccount("Ayush","ACC123",5000);
        acc.display(); acc.deposit(2000); acc.withdraw(3000); acc.withdraw(5000); acc.display();
    }
}

