public static void main(String[] args){
	Checking acct1 = new Checking();
       acct1.deposit(13.50);
	System.out.println(acct1.getBalance());
       acct1.withdrawal(2.00);
    System.out.println(acct1.getBalance());
}