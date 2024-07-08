class Door{
static int open = 0;
		public static int Open(){
		System.out.println("the door is open started");
		if(open == 0){
		open = 1;
		System.out.println("the door is succefully opened");
		
		}
		System.out.println("the door open is end");
return open;


}

public static int Close(){
System.out.println("the door started is closed");
if(open == 1){
open = 0;
System.out.println("the door started is closed end");

}
System.out.println("the door is closed end");
return open;
}

}
