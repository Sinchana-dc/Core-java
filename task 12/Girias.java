
 import java.util.*;
class Girias{

static String homeAppliances[]={null,null,null,null,null,null,
null,null,null,null,null,null};

static int index;

public static boolean createHomeAppliances(String homeAppliance){

      boolean isHomeAppliancesAdded=false;
	  if(homeAppliance!=null){
	  homeAppliances[index]=homeAppliance;
	  index++;
	  isHomeAppliancesAdded=true;
	  }else System.out.println("The Home appliances must be added...");
	  
	  return isHomeAppliancesAdded;
	  }
	  
	  public static void getHomeAppliances(){
	  System.out.println("The Home Appliances are");
	  for(String homeAppliance:homeAppliances){
	   System.out.println(homeAppliance);
	   }
	   }
	   
	  public static boolean updateHomeAppliances(String oldHomeAppliance,String newhomeAppliance){
          System.out.println("updateHomeAppliances started");
		   boolean isHomeAppliancesUpdated=false;
		  for(int index=0;index<homeAppliances.length;index++){
			  if(oldHomeAppliance==homeAppliances[index]){
				  homeAppliances[index]=newhomeAppliance;
				  isHomeAppliancesUpdated=true;
			  }
		  }
		  if(isHomeAppliancesUpdated=false){
			  System.out.println(oldHomeAppliance+"Not Found");
		  }

        System.out.println("updateHomeAppliances ended");
            return isHomeAppliancesUpdated;
	  }




        public static boolean deleteHomeAppliance(String homeApplianceToBeDeleted){
            System.out.println("deleteHomeAppliance started");
			      boolean isHomeApplianceDeleted=false;
				    int newIndex,oldIndex;
					for(newIndex=0,oldIndex=0;oldIndex<homeAppliances.length;oldIndex++){
						if(homeAppliances[oldIndex]!=homeApplianceToBeDeleted){
							homeAppliances[newIndex]=homeAppliances[oldIndex];
							 newIndex++;
						}
					}
					homeAppliances=Arrays.copyOf(homeAppliances,newIndex);
					if(homeAppliances!=null){
					    isHomeApplianceDeleted=true;	
					}
					if(isHomeApplianceDeleted==false){
						System.out.println(homeApplianceToBeDeleted+"Not Found");
					}
					
            System.out.println("deleteHomeAppliances ended");
                return isHomeApplianceDeleted;
			}				
	   }
	  