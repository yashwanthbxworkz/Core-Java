class Speaker{

static boolean isConneted = false;
public static boolean turnon(){


System.out.println("start of turnon");
if(isConneted == false){
isConneted = true;
System.out.println("the speaker is trunon.......");

}

System.out.println("end of turnon");
return isConneted;

}

public static boolean turnoff(){
System.out.println("start of turnoff");
if(isConneted == true){
isConneted = false;
System.out.println("the speaker is turnoff");


}

System.out.println("end of turnoff");
return isConneted;

}
}