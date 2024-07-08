class Fan{
	static int power = 1;
public static int on(){
System.out.println("the started to on");
if(power == 0){
power = 1;
System.out.println("the fan is started succefully");
}
return power;


}
public static int off(){
System.out.println("the fan is started to off");
if(power == 1){
power = 0;
System.out.println("the fan is off is end");
}
return power;
}
}