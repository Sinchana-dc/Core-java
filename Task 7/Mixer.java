class Mixer{

static boolean isConnected ;
   static int currentVolume ;
   static int maxVolume =10;
   static int minVolume ;

public static void onOrOff(){
    System.out.println("onOrOff Started");
	if(isConnected == false){
	isConnected = true;
	System.out.println("Mixer is Turned on");
	}else if(isConnected ==true){
	isConnected = false;
	System.out.println("Mixer is Turned off");
	}
	System.out.println("onOrOff Ended");
	return;
	}
	
	
public static void increaseVolume(){
           System.out.println("increaseVolume() Started");
		   if(isConnected ==true){
		   if(currentVolume <=maxVolume){
		       currentVolume = currentVolume +1;
			   System.out.println("the Current Volume is"+currentVolume );
			   }else{
			   System.out.println("Max Volume Reached");
			   }
			   }else{
			   System.out.println("Switch On the Mixer....");
			   }
			   System.out.println("increaseVolume() Ended");
		      return;
			  }
}
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   