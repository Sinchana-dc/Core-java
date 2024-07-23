class XworkzRunner{
public static void main(String institute[]){

   boolean isTraineeRegistered = Xworkz.registerTrainee("Sinchana","1AK20CS025","Akshaya Institute of Technology",
                           "14/11/2002",9113690076L,"sinchan@gmail@gmail.com",7.21);

	
	 
	 if(isTraineeRegistered=true){
	      Xworkz.getTraineeDetails();
	 }
		 else{
			 System.out.println("Please Provide valid Candidate Details......");
		 }
}
}	 