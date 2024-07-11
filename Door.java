class Door{
static boolean isopen = false;
 static int full = 3;
static int half = 2;
 static int low = 0;
		public static boolean Openorclosed(){
		System.out.println("the door is open started");
		isopen = (isopen == false) ?true: false;
		
return isopen;

		}


public static void full(){
						System.out.println("method full started");

							if(isopen){
									if(half < full){
											half++;
												System.out.println(" half is  " + half);
									}else{
											
													System.out.println(" is full reached");
										}
			
							}else{
								System.out.println("the full closed");
			
			
								}
										System.out.println("method full ended");

		 
		}
	
	public static void low(){	
				System.out.println("method low started");



			if(isopen){
				if(half > low){
						half--;

						System.out.println("half is " + half);
				}else{
				System.out.println("the low is reached");
				}
			}else{
			System.out.println("the low is closed");
			}
					
					System.out.println("method low ended");

			
	}    		
}
  
	  






		