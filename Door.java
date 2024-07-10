class Door{
static boolean open = false;
		public static boolean Openorclosed(){
		System.out.println("the door is open started");
		if(open == false){
		open = true;
		System.out.println("the door is succefully opened");
		
		}else if(open == true){
			open = false;
		System.out.println("the door open is end");	
		}
		
return open;

		}
}

//public static int Close(){
//System.out.println("the door started is closed");
//if(open == 1){
//open = 0;
//System.out.println("the door started is closed end");

//}
//System.out.println("the door is closed end");
//return open;
//}

//}
