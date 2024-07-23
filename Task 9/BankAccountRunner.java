class BankAccountRunner{


public static void main(String [] sbiBank){

BankAccount.credit(200);
double panda = BankAccount.getBalance();

System.out.println(panda);

BankAccount.credit(300);
 panda = BankAccount.getBalance();
System.out.println(panda);
BankAccount.credit(100);
 panda = BankAccount.getBalance();
BankAccount.credit(500);
 panda = BankAccount.getBalance();
BankAccount.credit(600);
 panda = BankAccount.getBalance();


System.out.println(panda);
}

}