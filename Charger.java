class Charger{
static boolean isconnected = false;
static int increaselevel = 3;
static int decreaselevel = 0;
static int currentlevel = 0;
public static boolean chargerornot(){
System.out.println("the charger is chargered started");
isconnected = (isconnected == false)?true:false;
return isconnected;
}
public static void increaselevel(){
						System.out.println("method increaselevel started");

							if(isconnected){
									if(currentlevel < increaselevel){
											currentlevel++;
												System.out.println(" current level is  " + currentlevel);
									}else{
											
													System.out.println("the  increaselevel reached");
										}
			
							}else{
								System.out.println(" trunoff");
			
			
								}
										System.out.println("method increaslevel ended");

		 
		}
	
	public static void decreaselevel(){	
				System.out.println("method decreaslevel started");



			if(isconnected){
				if(currentlevel > decreaselevel){
						currentlevel--;

						System.out.println(" current level is " + currentlevel);
				}else{
				System.out.println("the  decreaselevel is reached");
				}
			}else{
			System.out.println("  is trun off");
			}
					
					System.out.println("method decreaselevel ended");

			
	}    		
}
  
	  




