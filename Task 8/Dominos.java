class Dominos{
public static double takeOrders(String foodName){


            if(foodName == "Blazing Onion & Paprika"){
			return 329.00;
			}
			if(foodName == "Fiery Sausage & Paprika"){
			return 449.00;
			}
			if(foodName == "Primavera Gourmet-Pizza"){
			return 549.00;
			}
			if(foodName == "Smoked Chicken Gourmet-Pizza"){
			return 629.00;
			}	
			if(foodName == "Margherita"){
			return 239.00;
			}
			if(foodName == "Farmhouse"){
			return 459.00;
			}
			if(foodName == "Peppy Paneer"){
			return 459.00;
			}
			if(foodName == "Veg Extravaganza"){
			return 549.00;
			}
			if(foodName == "Veggie Paradise"){
			return 459.00;
			}
			if(foodName == "Lava cake"){
			return 379.00;
			}
			if(foodName == "Pepper Barbecue Chicken"){
			return 449.00;
			}
			if(foodName == "Chicken Sausage"){
			return 369.00;
			}
			if(foodName == "Chicken Pepperoni Gourmet-Pizza"){
			return 629.00;
			}
			if(foodName == "Blazing Onion & Paprika"){
			return 329.00;
			}
			if(foodName == "Fresh Veggie"){
			return 379.00;
			}else{
				System.out.println(foodName +"Not Found");
			} 
            
			return 0.0;
			}
}