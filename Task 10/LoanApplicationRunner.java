class LoanApplicationRunner{
public static void main(String loan[]){

boolean isLoanApplied= LoanApplication.applyLoan("Union",123456789123L,200,"Personal Loan",300.0);



if(isLoanApplied=true){
	 LoanApplication.fetchLoanDetails();
	 }else{
		 System.out.println("Please Provide Valid Bank account Details......");
	 }
}
}