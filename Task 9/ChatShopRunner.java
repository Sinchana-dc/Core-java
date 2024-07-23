class ChatShopRunner{
 public static void main(String[]shop){
 boolean addchat=ChatShop.createChatName("pani puri");
 boolean addPrice=ChatShop.addChatPrice(30.00);
 System.out.println("addchat");
 System.out.println("pani puri price is"+ addPrice);
 
 addchat=ChatShop.createChatName("sev puri");
  addPrice=ChatShop.addChatPrice(40.00);
 System.out.println("addchat "); 
 System.out.println( "sev puri price is"+ addPrice);
  addchat=ChatShop.createChatName("dahi puri");
  addPrice=ChatShop.addChatPrice(50.00);
 System.out.println("addchat ");
 System.out.println( "dahi puri price is"+ addPrice);
 
  addchat=ChatShop.createChatName("tikki puri");
  addPrice=ChatShop.addChatPrice(20.00);
 System.out.println("addchat ");
 System.out.println( "tikki puri price is"+ addPrice);
 
  addchat=ChatShop.createChatName("masala puri");
  addPrice=ChatShop.addChatPrice(25.00);
 System.out.println("addchat");
 System.out.println( "masala puri price is"+ addPrice);
 
  addchat=ChatShop.createChatName("bhel puri");
  addPrice=ChatShop.addChatPrice(35.00);
 System.out.println("addchat");
 System.out.println( "bhel puri price is"+addPrice);
 
 
 
 boolean updateChat=ChatShop.updatedChatName("Samosa","Gobi");
   System.out.println("The chat name is "+updateChat);
 
 
 
 
 
 
 ChatShop.getChatNames();
 
 ChatShop.getChatPrices();
 
 }
 }