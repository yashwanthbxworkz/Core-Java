class Fan{
	static boolean power = false;
public static boolean onoroff(){
System.out.println("the started to on");
if(power == false){
power = true;
System.out.println("the fan is started succefully");
}else if(power == true){
power = false;
System.out.println("the fan is turnoff");
}
System.out.println("the fan run is end");
return power;
}

}
//public static int off(
//System.out.println("the fan is started to off");
//if(power == 1){
//power = 0;
//System.out.println("the fan is off is end");
//}
//return power;
//}
//}