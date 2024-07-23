class GymRunner{

public static void main(String gym[]){
    
	boolean addvalue = Gym.createGymEquipments("Leg Extention");
	System.out.println(addvalue);
	
	addvalue = Gym.createGymEquipments("Biceps");
	System.out.println(addvalue);
	
	addvalue = Gym.createGymEquipments("Pack Fly");
	System.out.println(addvalue);
	
	addvalue = Gym.createGymEquipments("T-Bar");
	System.out.println(addvalue);
	
	addvalue = Gym.createGymEquipments("Linear Leg Press");
	System.out.println(addvalue);
	
	addvalue = Gym.createGymEquipments("Dumbbell");
	System.out.println(addvalue);
	
	addvalue = Gym.createGymEquipments("Leg Rack");
	System.out.println(addvalue);
	
	addvalue = Gym.createGymEquipments("Treadmil");
	System.out.println(addvalue);
	
	Gym.getGymEquipments();
	
	boolean updatevalue=Gym.updateGymEquipment("Dumbbell","Chest Fly Machine");
	System.out.println(updatevalue);
	
	Gym.getGymEquipments();
	
	
	Gym.deleteGymEquipment("Pack Fly");
	Gym.getGymEquipments();
	}
	}