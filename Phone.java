class Phone{
   static boolean isConnected = false;
   static int maxvolume = 6;
   static int currentvolume = 0;
   static int minvolume = 0;
   public static boolean onoroff(){
   System.out.println("the phone get started to wroking");
   if(isConnected == false){
    isConnected = true;
	System.out.println("the phone is on");
   }
   else if(isConnected == true){
   isConnected = false;
   System.out.println("the phone is completely trunoff");
   }
   return isConnected;
   }
   public static void increaseVolume(){
						System.out.println("method increasevolume started");

							if(isconnected){
									if(currentvolume < maxvolume){
											currentvolume++;
												System.out.println("phone current volume is  " + currentvolume);
									}else{
											
													System.out.println("the phone is maxvolume reached");
										}
			
							}else{
								System.out.println("the phone trunoff");
			
			
								}
										System.out.println("method increasevolume ended");

			}
	
	public static void decreaseVolume(){	
				System.out.println("method decreasevolume started");



			if(isconnected){
				if(currentvolume > minvolume){
						currentvolume--;

						System.out.println("phone current volume is " + currentvolume);
				}else{
				System.out.println("the phone minvolume is reached");
				}
			}else{
			System.out.println("the phone is trun off");
			}
					
					System.out.println("method decreaseVolume ended");

			
	}    	
}


