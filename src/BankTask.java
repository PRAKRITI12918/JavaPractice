class Customer {
    String holdername;
    double balance;
    double amount;

    void displayDetails() {
        System.out.println("Holder name:" + holdername);
        System.out.println("Balance:" + balance);
    }

     void deposite(double amount) {
        balance = balance + amount;
    }
}
    public class BankTask{
        public static void main(String[] args) {
            Customer c1;
            Customer c2;
            c1=new Customer();
            c2=new Customer();
            c1.holdername="Prakriti";
            c1.amount=200;
            c1.balance=100;

            c2.holdername="Shirish";
            c2.amount=500;
            c2.balance=200;

            c1.deposite(c1.amount);
            c2.deposite(c2.amount);

            c2.displayDetails();
            c1.displayDetails();


        }

    }
