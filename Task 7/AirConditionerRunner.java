class AirConditionerRunner{
public static void main(String ac[]){
System.out.println("Main Started");
      AirConditioner.onOrOff();
	  System.out.println("The Ac turn on");
	  AirConditioner.onOrOff();
	  System.out.println("The Ac turn off");
	  AirConditioner.getFeatures();
	  AirConditioner.increaseTemperature();
	  AirConditioner.decreaseTemperature();
System.out.println("Main Ended");	  
	 
	  }
	  }