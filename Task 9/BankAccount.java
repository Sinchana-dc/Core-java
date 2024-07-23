class BankAccount{

static double balance ;
public static void debit (double amount){
	System.out.println("Debit Started");
	balance = balance-amount;
	else{
		System.out.println("Insufficient Funds");
	System.out.println("Debit ended");
	return ; 
}



public static void credit (double amount){
	
System.out.println("Credit Started ");
if(amount>0){

 balance = balance+amount;
 else
 {
 System.out.println("Amount can't be zero");
return ;
}


public static double getBalance(){
	System.out.println("The Blalance");
 return balance;
}





}