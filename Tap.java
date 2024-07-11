class Tap{

     static boolean ispipe = false;
      static int maxspeed = 6;
      static int currentspeed= 0;
       static int minspeed = 0;
	  public static boolean openorclosed(){
	     System.out.println("the pipe  full is started ");
		 ispipe = (ispipe == false) ?true: false;
		 
		 System.out.println("the pipe is full flow is end");
return ispipe;
}
public static void increasespeed(){
						System.out.println("method increasespeed started");

							if(ispipe){
									if(currentspeed < maxspeed){
											currentspeed++;
												System.out.println("speed current speed is  " + currentspeed);
									}else{
											
													System.out.println("the speed is maxspeed reached");
										}
			
							}else{
								System.out.println("the pipe trunoff");
			
			
								}
										System.out.println("method increasespeed ended");

		 
		}
	
	public static void decreasespeed(){	
				System.out.println("method decreasespeed started");



			if(ispipe){
				if(currentspeed > minspeed){
						currentspeed--;

						System.out.println("speed current speed is " + currentspeed);
				}else{
				System.out.println("the speed minspeed is reached");
				}
			}else{
			System.out.println("the speed is trun off");
			}
					
					System.out.println("method decreasespeed ended");

			
	}    // method 	decreaseVolume		
}
  
	  















