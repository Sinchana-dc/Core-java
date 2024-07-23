class GiriasRunner{

public static void main(String appliance[]){

      boolean products=Girias.createHomeAppliances("Steenless Steel bottle");
           System.out.println(products);
		   
		   
	   products=Girias.createHomeAppliances("Electronic Chimney");
           System.out.println(products);
       
        products=Girias.createHomeAppliances("Non-Stick Cookware");
           System.out.println(products);

       products=Girias.createHomeAppliances("Iron Kenstar");
           System.out.println(products);


         products=Girias.createHomeAppliances("Cleaning Mob");
           System.out.println(products);

          products=Girias.createHomeAppliances("Water Heater");
           System.out.println(products);

           products=Girias.createHomeAppliances("Electronic Kettle");
           System.out.println(products);

            products=Girias.createHomeAppliances("Gas Stove");
           System.out.println(products);

             products=Girias.createHomeAppliances("Oven");
           System.out.println(products);

            products=Girias.createHomeAppliances("Grinder");
           System.out.println(products);

              products=Girias.createHomeAppliances("Vaccum Cleaner");
           System.out.println(products);

               products=Girias.createHomeAppliances("Garment Steamer");
           System.out.println(products);

       Girias.getHomeAppliances();
	   
	  boolean add = Girias.updateHomeAppliances("Gas Stove","Induction");
	  System.out.println(add);
	  
	   Girias.getHomeAppliances();
	   
	    Girias.deleteHomeAppliance("Garment Steamer");
		
		 Girias.getHomeAppliances();
	   
		
		
	   
	   
	   
}
}	   