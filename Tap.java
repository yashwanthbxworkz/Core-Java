class Tap{

   static int pipe = 0;
      
	  public static int flow(){
	     System.out.println("the pipe  full is started ");
		 if(pipe == 0){
		 pipe = 1;
		  System.out.println("the pipe is started full...");
		  
		 }
		 System.out.println("the pipe is full flow is end");
return pipe;
}		 
	  
	   public static int empty(){
System.out.println("the pipe  empty is started ");
if(pipe == 1){
pipe = 0;
System.out.println("the pipe is  started to empty");
}
	System.out.println("the pipe empty is end");
	 return pipe; 
	   } 
	  
	  
	
	  }
	  

















