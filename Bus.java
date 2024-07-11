class Bus{
static boolean ismove = false;
public static boolean movingornot(){
System.out.println("the bus is runing");
if(ismove == false){
ismove = true;
System.out.println("the bus is running succefully");

}else if(ismove == true){
	ismove = false;
	System.out.println("the bus is stop:" );
}
System.out.println("the bus stop is stop");
return ismove;

}

public static void increaseVolume(){
						System.out.println("method increasevolume started");

							if(ismove){
									if(currentvolume < maxvolume){
											currentvolume++;
												System.out.println("bus current volume is  " + currentvolume);
									}else{
											
													System.out.println("the bus is maxvolume reached");
										}
			
							}else{
								System.out.println("the bus trunoff");
			
			
								}
										System.out.println("method increasevolume ended");

			}
	
	public static void decreaseVolume(){	
				System.out.println("method decreasevolume started");



			if(ismove){
				if(currentvolume > minvolume){
						currentvolume--;

						System.out.println("bus current volume is " + currentvolume);
				}else{
				System.out.println("the bus minvolume is reached");
				}
			}else{
			System.out.println("the bus is trun off");
			}
					
					System.out.println("method decreaseVolume ended");

			
	}    	
}




