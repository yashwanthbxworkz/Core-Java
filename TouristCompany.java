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
}