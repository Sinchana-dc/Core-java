class ChatShop{
  static String name="GiriMariChats";
  static String ownerName="Girija S";
  static String chatNames[]={null,null,null,null,null,null};
  static int index;
  static int chatPriceIndex;
  
  static double chatPrice[]={0.0,0.0,0.0,0.0,0.0,0.0};
  
  public static boolean createChatName(String chatName){ 
  System.out.println("CreateChatName started");
  boolean isChatNameCreated= false;
  if(chatName!=null){
  chatNames[index]=chatName;
  index++;
  isChatNameCreated=true;
  }
  else
	  
  System.out.println("Chat name is null,can't be added");
  return isChatNameCreated;
  }
  public static void getChatNames(){
	  for(String chatName:chatNames){
		  System.out.println(chatName);
	  }
	  public static double addChatPrice(double chatPrice){
		  boolean isChatPriceAdded=false;
		  if(chatPrice>0){
			  chatPrices[chatPriceIndex]=chatPrice;
			  chatPriceIndex++;
			  isChatPriceAdded=true;
		  }
		  else
System.out.println("Chat price cant be zero");
return isChatPriceAdded;
	  }
  }
public static void getChatShop(){
	System.out.println("The available chats are:");
	for(String chatName:chatNames)
	System.out.println(chatName);

	  public static boolean updatedChatnames(String oldChatName.String newChatName){
		  
	
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
																																															
  
  
  
  
  
  