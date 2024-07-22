class BobWorld{
 static String  name; 
 static String  number;
 static String  mail;
 static String  path;
 static String  enter;
 static String  pay;
   
 

		public static boolean createapp(String fullName ,String mobileNumber, String email, String address,String password,  String paymentInformation){
		 boolean isentered = false;
		 boolean isfullNameInvalid = false;
			if(fullName != null){
				name =fullName;
				isfullNameInvalid = true;
				
			}else {
				System.out.println("the fullName is Invalid ");
				
			}
			boolean ismoblieNumberInvalid =  false;
			if(mobileNumber != null){
			number = mobileNumber;
			ismoblieNumberInvalid = true;
			}else{
				System.out.println("the mobileNumber is invalid");
			}
			boolean isemailInvalid= false;
			if(email != null){
				mail = email;
				isemailInvalid= true;
				
			}else {
				System.out.println("the email is Invalid ");
			}
			boolean ispasswordInvalid = false;
			if(password != null){
				enter = password;
				ispasswordInvalid = true;
			}
			else{
			System.out.println("the password is invalid");
			}
			boolean isaddressInvalid = false;
			if(address != null){
			path = address;
			isaddressInvalid = true;
			}else{
				System.out.println("the address is Invalid");
			}
			boolean ispaymentInformationInvalid = false;
			if(paymentInformation != null){
			pay = paymentInformation;
			}
			else {
			System.out.println("the paymentInformation is invalid");
			}
		name  = fullName; 
		number= mobileNumber;
		mail  = email;
		path  = address;
		enter = password;
		pay=    paymentInformation;
     if(isfullNameInvalid == true&& ismoblieNumberInvalid == true && isemailInvalid == true && isaddressInvalid == true && ispasswordInvalid== true&& ispaymentInformationInvalid == true ){
		 isentered = true;   
	 }
	 
return isentered;
}
		public static void readapp(){
		
		 System.out.println("the user fullName:"   +name ); 
         System.out.println("the user mobileNumber:" + number);
         System.out.println("the user Email:"+ mail);  
         System.out.println("the user address:"  + path ); 
         System.out.println("the user password:"+  enter );
        System.out.println("the user paymentInformation:"+pay);

		}
}