
import java.util.*;
class Gym{
	
	static String gymEquipmentNames[]={null,null,null,null,null,null,null,null}; 
	static int index;
	
	public static boolean createGymEquipments(String gymEquipmentName){
		boolean isGymEquipmentAdded=false;
		if(index<gymEquipmentNames.length){
		if(gymEquipmentName!=null){
			
			gymEquipmentNames[index]=gymEquipmentName;
			index++;
			isGymEquipmentAdded=true;
		}
		else
			System.out.println("Please Provide valid gym Equipments.....");
		}
		else{ 
		System.out.println("The Gym Euipments are full cann't be added any more....");
		}
		return isGymEquipmentAdded;
	}
	
	public static void getGymEquipments(){
		System.out.println("The Available Gym Equipments are");
		for(String gymEquipmentName:gymEquipmentNames){
			System.out.println(gymEquipmentName);
		}
	}
	
	public static boolean updateGymEquipment(String oldGymEquipmentName,
	String newGymEquipmentName){
		System.out.println("updateGymEquipment started");
		boolean isGymEquipmentUpdated = false;
		for(int index=0;index<gymEquipmentNames.length;index++){
			if(oldGymEquipmentName ==gymEquipmentNames[index]){
				gymEquipmentNames[index]=newGymEquipmentName;
				  isGymEquipmentUpdated=true;
			}
		}
		if(isGymEquipmentUpdated=false){
			System.out.println(oldGymEquipmentName+"Not Found");
		}
		System.out.println("updateGymEquipment ended");
		return isGymEquipmentUpdated;
	}
	
	
	public static boolean deleteGymEquipment(String gymEquipmentToBeDeleted ){
		System.out.println("deleteGymEquipment started");
		boolean isGymEquipmentDeleted=false;
		int newIndex,oldIndex;
		for(newIndex=0,oldIndex=0;oldIndex<gymEquipmentNames.length;oldIndex++){
			if(gymEquipmentNames[oldIndex]!=gymEquipmentToBeDeleted){
			gymEquipmentNames[newIndex] = 	gymEquipmentNames[oldIndex];
				newIndex++;
			}
		}
		gymEquipmentNames=Arrays.copyOf(gymEquipmentNames,newIndex);
		if(gymEquipmentNames!=null){
			isGymEquipmentDeleted=true;
		}
		if(isGymEquipmentDeleted == false){
			System.out.println(gymEquipmentToBeDeleted+"Not Found");
		}
		
		System.out.println("deleteGymEquipment ended");
	    return isGymEquipmentDeleted;
	}
	}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	       	                         