class Passport{
        static String cprLoc;
	    static int dcdrLoc;
	    static String givenNm;
		static String db;
		static String eml;
		static String surNm;
		static boolean login;
		static String logId;
		static String pw;
		static String hide;
		static String confirmPw;
		static String capt;
		 	 
public static boolean createPassport(String cprLocation, int dcdrLocation, 
String givenName,String dob, String email,String surName,boolean isEmailLoginSame,
String logInId,String pwd,String hideAns,String confirmPwd,String captcha ){ 
         
		 boolean isPassportDataCreated =false;
		 if(cprLoc!=null && dcdrLocation>0 && givenName!=null && dob!=null && email!=null && surName!=null
		 && isemailLoginsame!=null && loginId!=null && pw!=null && hide!=null && confirmPw!=null && capt!=null){
		 cprLoc =cprLocation;
		 dcdrLoc =dcdrLocation;
		 givenNm =givenName;
		 db =dob;
		 eml =email;
		 surNm =surName;
		 login=isEmailLoginSame;
		 logId= logInId;
		 pw= pwd;
		 hide=hideAns;
		 confirmPw =confirmPwd;
		 capt=captcha;
		 }
		 System.out.println("Account Created")
		else }
		System.out.println("Please provide detials of the user")
		   
		 return isPassportDataCreated; 
}    


         public static void getPassportDetails(){
         System.out.println("The cpr Location is:"+cprLoc);
		 System.out.println("The dcdr Location is:"+dcdrLoc);
		 System.out.println("The given Name of Person is:"+givenNm);
		 System.out.println("The Person Date of Birth is:"+db);
		 System.out.println("The User Email is:"+eml);
		 System.out.println("The User Sur Name is:"+surNm);
		 System.out.println("The Email is Log in:"+login);
		 System.out.println("The Log in Id is:"+logId);
		 System.out.println("The Password is:"+pw);
		 System.out.println("The Hidden Answer is:"+hide);
		 System.out.println("The Confirm PassPort is:"+confirmPw);
		 System.out.println("The Captcha is:"+capt);
		  
		 }
		  }
		 
		 
		 
		 
		 
