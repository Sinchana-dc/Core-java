class Swiggy{
public static double takeOrders(String foodName){

        if(foodName == "Milk Shake"){
		   return 90.00;
		}
		 if(foodName == "Paneer 65"){
		   return 360.00; 
		}
		 if(foodName == "Golden Baby corn"){
		   return 330.00;
		}
		 if(foodName == "Paneer Butter Masala"){
		   return 355.00;
		}
		 if(foodName == "Spl Veg Biryani"){
		   return 330.00;
		}
		 if(foodName == "Chilly Paneer"){
		   return 360.00;
		}
		 if(foodName == "Ginger Tea"){
		   return 101.00;
		}
		 if(foodName == "Naked RedVelvet Cake"){
		   return 769.00;
		}
		 if(foodName == "Paneer Makhani Chawal"){
		   return 240.00;
		}
		 if(foodName == "Dal Tadka Chawal"){
		   return 200.00;
		}
		 if(foodName == "Gulab Jamun"){
		   return 100.00;
		}
		 if(foodName == "Gajar Ka Halwa"){
		   return 135.00;
		}
		 if(foodName == "Lassi"){
		   return 85.00;
		}
		 if(foodName == "Nimbu Pani"){
		   return 60.00;
		}
		 if(foodName == "Coke"){
		   return 80.00;
		}else{
	          	System.out.println(foodName +"Not Found");
			} 
            
			return 0.0;
			}
}