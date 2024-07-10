class Human{
static boolean work = false;
public static boolean thinkornot(){
System.out.println("the human is work started");
if(work == false){
work = true;
System.out.println("the human is work end");
} else if(work == true){
	work = false;
	System.out.println("the human stop is working");
}
return work;

}

}
//public static int notwork(){
//System.out.println("the humanis stop working");
//if(work == 1){
//work = 0;
//System.out.println("the human i complete");

//}
//return work;


//}/
//}