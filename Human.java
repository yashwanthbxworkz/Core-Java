class Human{
static int work = 0;
public static int think(){
System.out.println("the human is work started");
if(work == 0){
work = 1;
System.out.println("the human is work end");
} 
return work;



}
public static int notwork(){
System.out.println("the humanis stop working");
if(work == 1){
work = 0;
System.out.println("the human i complete");

}
return work;


}
}