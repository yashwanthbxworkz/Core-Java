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
}
//public static int stop(){
//System.out.println("the bus is started is stoped");
//if(move == 1){
//move =0;
//System.out.println("the bus runing end");
//}
//return move;
//}

//}


