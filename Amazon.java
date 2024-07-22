class Amazon{

   static  String 	give;
   static  String  	use;
   static  String  	given;
   static  int 		box;
   static  String	enter;	


public static boolean createregistration(String name , String lastname, String email, int password , String address ){
	
	
			boolean isfulled = false;
			boolean isnameInvalid = false;
			if(name != null){
				give = name;
				isnameInvalid = true;
				
			}else {
				System.out.println("the name is Invalid ");
				
			}
			boolean islastnameInavalid =  false;
			if(lastname != null){
			use = lastname;
			isnameInvalid = true;
			}else{
				System.out.println("the last name is invalid");
			}
			boolean isemailInvalid= false;
			if(email != null){
				given = email;
				isemailInvalid= true;
				
			}else {
				System.out.println("the email is Invalid ");
			}
			boolean ispasswordInvalid = false;
			if(password != 0){
				box = password;
				ispasswordInvalid = true;
			}else{
				System.out.println("the password is invalid");
			}
			boolean isaddressInvalid = false;
			if(address != null){
			enter = address;
			isaddressInvalid = true;
			}else{
				System.out.println("the address is Invalid");
			}
			
			
                      give	= name ;
                      use	= lastname;
                      given	= email;
                      box	= password ;
                      enter	= address;
   	if(isnameInvalid== true && islastnameInavalid == true && ispasswordInvalid == true&& isaddressInvalid == true)isfulled = true;
	return isfulled;
	
	}

		public static void readregistration(){
		
		
		
		 System.out.println("the user name :"+ give);	
		 System.out.println("the user lastname:"  + use);	
		 System.out.println("the user email:"   +   given);
		 System.out.println("the user password:"  +  box);
         System.out.println("the user address:"   +  enter);
		 
}
}