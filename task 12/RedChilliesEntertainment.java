
import java.util.*;
class RedChilliesEntertainment{


static String movieActors[]={null,null,null,null,null,null,null,null,null};
static int index;

public static boolean addMovieActors(String movieActor){
	boolean isMovieActorNameAdded=false;
	if(movieActor!=null){
		movieActors[index]=movieActor;
		index++;
		isMovieActorNameAdded=true;
	}
	else System.out.println("Please Provide Valid Movie Actor Names......");
	
	return isMovieActorNameAdded;
}

public static void getMovieActors(){
	System.out.println("The Movie Actor Names are");
	for(String movieActor:movieActors){
		System.out.println(movieActor);
	}
}


public static boolean updateMovieActor(String oldMovieActor,String newMovieActor){
	System.out.println("updateMovieActor started");
	  boolean isMovieActorUpdated=false;
	  for(int index=0;index<movieActors.length;index++){
		  if(movieActors[index]==oldMovieActor){
			  movieActors[index]=newMovieActor;
			    isMovieActorUpdated=false;
		  }
	  }
	  if(isMovieActorUpdated=true){
		  System.out.println(oldMovieActor+"Not Found");
	  }
	  
		System.out.println("updateMovieActor ended");
	  return isMovieActorUpdated;
}
	


public static boolean deleteMovieActor(String movieActorToBeDeleted){
	System.out.println("deleteMovieActor started");
	boolean isMovieActorDeleted=false;
	int newIndex,oldIndex;
	for(newIndex=0,oldIndex=0;oldIndex<movieActors.length;oldIndex++){
		if(movieActors[oldIndex]!=movieActorToBeDeleted){
			movieActors[newIndex]=movieActors[oldIndex];
			newIndex++;
		}
	}
	movieActors=Arrays.copyOf(movieActors,newIndex);
	if(movieActors!=null){
		isMovieActorDeleted=true;
	}
	if(isMovieActorDeleted==false){
		System.out.println(movieActorToBeDeleted+"Not Found");
	}
	
	System.out.println("deleteMovieActor ended");
	return isMovieActorDeleted;
}

}


