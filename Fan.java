class Fan{
	static boolean isconnected = false;
	static int maxvolume = 6;
  static int currentvolume = 0;
 static int minvolume = 0;
public static boolean onoroff(){
System.out.println("the started to on");
if(isconnected == false){
ispower = true;
System.out.println("the fan is started succefully");
}else if(isconnected == true){
ispower = false;
System.out.println("the fan is turnoff");
}
System.out.println("the fan run is end");
return isconnected;
}
public static void increaseVolume(){
						System.out.println("method increasevolume started");

							if(isconnected){
									if(currentvolume < maxvolume){
											currentvolume++;
												System.out.println("fun current volume is  " + currentvolume);
									}else{
											
													System.out.println("the fun is maxvolume reached");
										}
			
							}else{
								System.out.println("the fun trunoff");
			
			
								}
										System.out.println("method increasevolume ended");

			}
	
	public static void decreaseVolume(){	
				System.out.println("method decreasevolume started");



			if(isconnected){
				if(currentvolume > minvolume){
						currentvolume--;

						System.out.println("fun current volume is " + currentvolume);
				}else{
				System.out.println("the fun minvolume is reached");
				}
			}else{
			System.out.println("the fun is trun off");
			}
					
					System.out.println("method decreaseVolume ended");

			
	}    		
}
				
					
					
					
					
					
					
					
					
				