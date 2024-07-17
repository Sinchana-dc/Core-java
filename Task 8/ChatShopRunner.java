class ChatShopRunner{
   
   public static void main (String[] shop)
   {
   boolean addChat=ChatShop.createChatName("PaniPuri");
   System.out.println("The chat Name is "+addChat);
    boolean priceAdded=ChatShop.addChatPrice(40.0);
	System.out.println("The chat Price  is "+priceAdded);
   
    addChat=ChatShop.createChatName("DahiPuri");
   System.out.println("The chat Name is "+addChat);
   priceAdded=ChatShop.addChatPrice(30.0);
   System.out.println("The chat Price  is "+priceAdded);
   
    addChat=ChatShop.createChatName("MasalPuri");
   System.out.println("The chat Name is "+addChat);
   priceAdded=ChatShop.addChatPrice(60.0);
   System.out.println("The chat Price  is "+priceAdded);
   
    addChat=ChatShop.createChatName("TikkiPuri");
   System.out.println("The chat Name is "+addChat);
   priceAdded=ChatShop.addChatPrice(50.0);
   System.out.println("The chat Price  is "+priceAdded);
   
    addChat=ChatShop.createChatName("BhelPuri");
   System.out.println("The chat Name is "+addChat);
  priceAdded=ChatShop.addChatPrice(45.0);
  System.out.println("The chat Price  is "+priceAdded);
  
  
  addChat=ChatShop.createChatName("Samosa");
   System.out.println("The chat Name is "+addChat);
   priceAdded=ChatShop.addChatPrice(20.0);
   System.out.println("The chat Price  is "+priceAdded);
   
   
   
   
   boolean updateChat=ChatShop.updatedChatName("Samosa","Mix Masala");
   System.out.println("The chat name is "+updateChat);
   
   
   ChatShop.getChatShop();


}}
   
