import java.util.*;
class TouristCompany{
	static int index;
	static	String touristPlaceName[] = {null,null,null,null,null,null,null,null,null,null};
			public static boolean searchforPlace(String nameOfPlace){
				boolean isfinding = false;
				if(index < touristPlaceName.length){
				if(nameOfPlace != null){
						touristPlaceName[index++] = nameOfPlace;
							isfinding = true;
				}else
				System.out.println("the tourist Place Name is invalid");
			
			
			
				}else
					System.out.println("the index is not out of range");
			
			
			return isfinding ;
			}
			public static void readplacename(){
			for(String placename: touristPlaceName){
			System.out.println("the tourist place name is : "+ placename);
			
			}
			}
			public static boolean upDataingTouristCompany(String oldPlaceName , String newPlaceName){
				boolean isupDataing = false;
				for(int position = 0 ; position < touristPlaceName.length;position++){
					if(touristPlaceName[position] == oldPlaceName){
						touristPlaceName[position] = newPlaceName;
						isupDataing = true;
					}
				}
				if(isupDataing==false)
					System.out.println(oldPlaceName + "not found");
				return isupDataing;
				
			}
			public static boolean deletedtouristPlaceName(String deleted){
				boolean isdeleting = false;
				int position, newposition;
				for(position=0 ,newposition=0;position<touristPlaceName.length;position++){
					if(touristPlaceName[position]!= deleted){
						touristPlaceName[newposition]=touristPlaceName[position];
						newposition++;
						isdeleting=true;
					}else
						isdeleting=false;
					
				}
				
				touristPlaceName = Arrays.copyOf(touristPlaceName , newposition);
				return isdeleting;
			}
}