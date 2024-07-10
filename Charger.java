class Charger{
static boolean isconnected = false;
public static boolean chargerornot(){
System.out.println("the charger is chargered started");
if(isconnected == false){
isconnected = true;
System.out.println("the charger is completed ");

}else if(isconnected == true){
	isconnected = false;
	System.out.println("the charger is remove lesscharger");
}
System.out.println("the charger is end");
return isconnected;
}
}
//public static boolean uncharged(){
//System.out.println("the charged is unchared");
//if(isconnected == true){
//isconnected = false;
//System.out.println("the charged  end");
//}
//return isconnected;

//}
//}