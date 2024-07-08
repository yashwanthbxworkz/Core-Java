class Charger{
static boolean isconnected = false;
public static boolean charges(){
System.out.println("the charger is chargered started");
if(isconnected == false){
isconnected = true;
System.out.println("the charger is completed ");


}
return isconnected;

}
public static boolean uncharged(){
System.out.println("the charged is unchared");
if(isconnected == true){
isconnected = false;
System.out.println("the charged  end");
}
return isconnected;

}
}