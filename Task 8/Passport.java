class Passport {

public static boolean createPassport(String cpcLocation,int dcdrLocation,String givenName, String email,String surName,
boolean isEmailLoginSame,String loginId,String pwd,String hideAns,String confirmPwd,String captcha,String dob){

boolean isPassportCreated = false;

System.out.println("The cpLocation is "+cpcLocation);
System.out.println("The dcdrLocation is"+dcdrLocation);
System.out.println("The givenName is"+givenName);
System.out.println("The  email is "+email);
System.out.println("The dob is "+dob);
System.out.println("The surName is "+surName);
System.out.println("The email login is"+isEmailLoginSame);
System.out.println("The loginId is"+loginId);
System.out.println("The password is "+pwd);
System.out.println("The hidden answer is "+hideAns);
System.out.println("The confirmed password is "+confirmPwd);
System.out.println("The captcha entered is "+captcha);
return isPassportCreated;
}
}
