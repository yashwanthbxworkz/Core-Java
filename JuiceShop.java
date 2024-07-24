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



		public static void ShowesjuicesNames(){
		
			for(String juiceNamed:juiceName){
			
			System.out.println("the juiceName is added:" + juiceNamed);
			
			}
		
		
		}
			






}