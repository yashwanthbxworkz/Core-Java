class Tap{

   static boolean pipe = false;
      
	  public static boolean openorclosed(){
	     System.out.println("the pipe  full is started ");
		 if(pipe == false){
		 pipe = true;
		  System.out.println("the pipe is started full...");
		  
		 }else if(pipe == true){
			 pipe = false;
			 System.out.println("the tap is stop");
		 }
		 System.out.println("the pipe is full flow is end");
return pipe;
}
}		 
	  
	  // public static int empty(){
//System.out.println("the pipe  empty is started ");
//if(pipe == 1){
//pipe = 0;
//System.out.println("the pipe is  started to empty");
//}
	//System.out.println("the pipe empty is end");
	 //return pipe; 
	   //} 
	  
	  
	
	  //}
	  

















