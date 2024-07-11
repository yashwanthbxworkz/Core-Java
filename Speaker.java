class Speaker{

static boolean isConneted = false;
           int     maxvolume = 6;
		   int   currentvolume = 0;
public static boolean onOrOff(){


System.out.println("start of turnon");
if(isConneted == false){
isConneted = true;
System.out.println("the speaker is trun on");


	
	

}	
	else if(isConneted == true) {
		isConneted = false;
		System.out.println("the speaker is trunoff ");
	}
//isConneted = true;

//}else if(isConneted){
	//isConneted = false;
//}

System.out.println("end of turnon");
return isConneted;

}
public static void involume();
if(isConneted){
	if(currentvolume < maxvolume){
		involume+ = 1;
		
	}else{
		System.out.println("the speaker null");
	}
}else {
	System.out.println("the );
	
}

} 


//public static boolean turnoff(){
//System.out.println("start of turnoff");
//if(isConneted == true){
//isConneted = false;
//System.out.println("the speaker is turnoff");


//}

//System.out.println("end of turnoff");
//return isConneted;

//}
//}