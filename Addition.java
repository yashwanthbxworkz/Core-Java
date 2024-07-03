class Addition{
		public static void main(String[] sum){
		System.out.println("main is started");
		
		add( 10 , 45);
		add( 45 , 55);  //invoked the methed by passing 2 arguments
		
		
		System.out.println("main is ending");
		
		
		}
		
		//method decelaration
		public static void add(int num1 , int num2){
		System.out.println("adding method started");
		System.out.println(num1 + num2);
		System.out.println("adding method ending");
		
		return ; //nothing value is return
		}


}