class JuiceShop{
			static String juiceName[] = {null, null , null, null ,null , null};
				static int index;

			public static boolean juiceNameAdded(String juiceNames){
			boolean isfulledadded = false;
			if(index < juiceName.length){
				if(juiceNames != null){
				juiceName[index++]= juiceNames;
				isfulledadded = true;
			}else
				System.out.println("the  juiceName is invalid ");
			
			}else 
				System.out.println("the juic name is not out of range");
			
			return isfulledadded;
			} 



		public static void showesJuicesNames(){
		
			for(String juiceNamed:juiceName){
			
			System.out.println("the juiceName is added:" + juiceNamed);
			
			}
		
		}
		
			public static boolean updateJuiceName(String oldJuiceName, String newJuiceName){
				boolean isupdataing = false;
					for(int position = 0; position<juiceName.length; position++){
						if(juiceName[position]== oldJuiceName){
					juiceName[position] = newJuiceName;
					isupdataing = true;
					}
							
				
			}
			if(isupdataing == false)
			System.out.println(oldJuiceName + " not found");
			
				
			return isupdataing;	
		}
			

		




}