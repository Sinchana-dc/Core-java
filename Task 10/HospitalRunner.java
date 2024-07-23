class HospitalRunner{
public static void main(String hospital[]){


boolean isPatientRegistered= Hospital.registerPatient("Sinchana","14/11/2002",22,"Banglore","Female",
9113690073L,"SoftwareTrainee",634192810365L,"Headache",56);


 if(isPatientRegistered=true){
	    Hospital.fetchPatientDetails();  
	 }
		 else{
			 System.out.println("Please Provide valid Candidate Details......");
		 }
}
}	 

