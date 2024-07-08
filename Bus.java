class Bus{
static int move =0;
public static int go(){
System.out.println("the bus is runing");
if(move == 0){
move = 1;
System.out.println("the bus is running succefully");

}
return move;


}
public static int stop(){
System.out.println("the bus is started is stoped");
if(move == 1){
move =0;
System.out.println("the bus runing end");
}
return move;
}

}


