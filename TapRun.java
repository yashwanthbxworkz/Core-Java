class TapRun{
public static void main(String[] go){

 boolean flowed = Tap.openorclosed();
 System.out.println("the tap completed flowed:" + flowed);
  flowed = Tap.openorclosed();
 System.out.println("the tap completed flowed is stop: " + flowed);

}


}