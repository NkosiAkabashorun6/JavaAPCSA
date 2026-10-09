public class Checking{
  
     final double MINIMUM = 25.00;
     private byte num_accounts = 0;
     private double balance = 0.00;
     

     //Constructor method; creates instances of the Checking class
     public Checking(){
          double balance = MINIMUM;  
     }

     public byte addAccount(){
            num_accounts+=1;
       }
       
     //Method to get current account balance
     public double getBalance(){
         return balance;
     }
     
     //Method to perform a deposit on the account
     public void deposit(double dep_amount){
           balance+=dep_amount;
     }
     
     //Method to perform a withdrawal on an account
     public void withdrawal(double withdr_amt){
           balance-=withdr_amt;
     }
}
