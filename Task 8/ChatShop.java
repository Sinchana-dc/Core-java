class ChatShop{

  static String name="shri";
  static String ownerName ="Giri";
  
  //Datatypes arrayVariable[]={value};
  static String chatNames[]={null,null,null,null,null,null};
  static int index;
  static double chatPrices[]={0.0,0.0,0.0,0.0,0.0,0.0};
  
  static int chatPriceIndex;
  
  
  //add chatName is chatNames index posit(ref)
  
  public static boolean createChatName(String chatName){
   System.out.println("create chatName started");
   boolean isChatNameCreated = false;
   if(chatName!= null)
   {
   
       chatNames[index]=chatName;
	   index++;
	   isChatNameCreated=true;
   }else System.out.println("chatName is null,cannot be added");
   
   System.out.println("create chatName Ended");
   
   
   return isChatNameCreated;
   }
   
   public static boolean addChatPrice(double chatPrice){
     System.out.println("ChatPrice added");
     boolean isPriceAdded = false;
      if(chatPrice>0.0){
		  chatPrices[chatPriceIndex] = chatPrice;
		  chatPriceIndex++; 	
     isPriceAdded = true;		  
   }else System.out.println("Price cannot be added");
   
   System.out.println("ChatPrice Ended");
   return isPriceAdded;
   }
   
   
   
   public static void getChatShop(){
	   System.out.println("The available chats are:");
	   
	   for(String chatName:chatNames)
		   System.out.println(chatName);
   }
	   
	public static boolean updatedChatName(String oldChatName,String newChatName){
		System.out.println("updatedChatName started");
		boolean isChatNameUpdated = false;
		for(int index=0;index<chatNames.length;index++){
			if(oldChatName == chatNames[index]){
				chatNames[index] = newChatName;
		     isChatNameUpdated = true;
			}
		}
		if(isChatNameUpdated ==false){
			System.out.println(oldChatName + "not found");
		}
		
		
		System.out.println("updatedChatName Ended");
		return isChatNameUpdated;
	}
	}