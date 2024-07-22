class Spotify{
static String mail; 
static int enter;
static int box ;
static String full; 
static String user ;


	public static boolean createaccount(String emailAddress ,int password ,String userName ,int birthDate ,String gender){
	
	boolean isformfulled = false;
	
	boolean ispasswordInvalid = false;
			if(password != 0){
				enter = password;
				ispasswordInvalid = true;
	}
			else{
			System.out.println("the password is invalid");
			}
			boolean isemailAddressInvalid= false;
			if(emailAddress != null){
				mail = emailAddress;
				isemailAddressInvalid= true;
				
			}else {
				System.out.println("the emailAddress is Invalid ");
			}
			boolean isbirthDateInvaild = false;
							if(birthDate != 0){
								box = birthDate;
								isbirthDateInvaild = true;
							}else{
								System.out.println("the birthDate is Ivalid");
							}
							boolean isuserNameInvalid = false;
							if(userName != null){
									user = userName;
									isuserNameInvalid = true;
											}else{
											System.out.println("surname is Invaild");
									}
									boolean isgenderInvalid = false;
										if(gender != null){
										full = gender;
										isgenderInvalid = true;
			
		
											}else{
												System.out.println("the gender is invalid");
											}
											mail  = emailAddress;
											enter = password;
											box = birthDate;
											full = gender;
											user = userName;
	if(ispasswordInvalid == true && isemailAddressInvalid== true && isuserNameInvalid == true && isgenderInvalid==true && isbirthDateInvaild== true){
		isformfulled = true;
	}
	return isformfulled;
	}
	
	
	
public static void readaccount(){

					 System.out.println("the user email :"+ mail);
                     System.out.println("the user password:"+enter);
                     System.out.println("the user birthDate:"+box);   
                     System.out.println("the user gender:"+ full); 
                    System.out.println("the user sur:"+   user);
}                    


}