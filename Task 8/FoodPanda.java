class FoodPanda{
public static double takeOrders(String foodName){


            if(foodName == "Ragi Roti"){
			return 329.00;
			}
			if(foodName == "Tandoori Roti"){
			return 449.00;
			}
			if(foodName == "Sushi"){
			return 549.00;
			}
			if(foodName == "Tacos"){
			return 629.00;
			}	
			if(foodName == "Burrito"){
			return 239.00;
			}
			if(foodName == "Toast"){
			return 459.00;
			}
			if(foodName == "Cheese Cake"){
			return 459.00;
			}
			if(foodName == "Chaped Liver"){
			return 549.00;
			}
			if(foodName == "Cabbage Role"){
			return 459.00;
			}
			if(foodName == "Tortilla"){
			return 379.00;
			}
			if(foodName == "Yakiniku"){
			return 449.00;
			}
			if(foodName == "Strawberry Cake"){
			return 369.00;
			}
			if(foodName == "Lomo Saltado"){
			return 629.00;
			}
			if(foodName == "Momos"){
			return 329.00;
			}
			if(foodName == "Bagguette"){
			return 379.00;
			}else{
				System.out.println(foodName +"Not Found");
			} 
            
			return 0.0;
			}
}