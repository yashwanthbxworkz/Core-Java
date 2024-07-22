class XworkZ{
static String first;
static String last;
static int    bo;
static String branc;
static double per;
static double per1;
static int    cgpa;
static int    phone;

		public static boolean trainerregisteration(String firstName, String lastName , int bod , String branch , double percentageOfPuc , double percentageOfSslc, int Cgpa ,int phonenumber){
		
		
				boolean isfulledform= false;
				boolean isfirstNameInvalid = false;
				if(firstName != null){
					first = firstName;
					isfirstNameInvalid = true;
				}else {
					System.out.println("the fristname is Invalid");
				}
				boolean islastNameInvalid = false;
				if(lastName != null){
					last = lastName;
					islastNameInvalid= true;
				}else {
					System.out.println("the last name Invalid ");
				}
				boolean isbodInvalid = false;
				if(bod != 0){
					bo = bod;
					isbodInvalid = true;
				}
				else {
					System.out.println("the bod is Invalid ");
					
				}
					boolean isbranchInvalid = false;
					if(branch != null){
						branc = branch;
						isbranchInvalid = true;
					}else{
						System.out.println("the branchis  invalid");
					}
					boolean ispercentageOfPucInvalid = false;
					if(percentageOfPuc != 0){
					per = percentageOfPuc;
					ispercentageOfPucInvalid = true;
					}else {
						System.out.println("the percentageOfPuc is invalid");
					}
					boolean ispercentageOfSslcInvalid = false;
					if (percentageOfSslc != 0){
						per1 = percentageOfSslc;
						ispercentageOfSslcInvalid = true;
					}else {
						System.out.println("the percentageOfSslc is invalid " );
					}
					boolean isCgpaInvalid =  false;
					if(Cgpa != 0){
					cgpa = Cgpa;
					isCgpaInvalid = true;
		}else {
			System.out.println("the cgpa is Invalid ");
		}
		boolean isphonenumberInvalid = false;
		if(phonenumber >0){
			phone = phonenumber;
			isphonenumberInvalid = true;
		
						
		}		
		
		
		
	
		
		if(isfirstNameInvalid == true && islastNameInvalid == true && isbodInvalid== true && isbranchInvalid== true && ispercentageOfPucInvalid== true && ispercentageOfSslcInvalid== true && isCgpaInvalid== true && isphonenumberInvalid== true )
			      isfulledform = true;
		
		
		return isfulledform ;
}

public static void readregistation(){
	 System.out.println("the user fistname: " + first);
	 System.out.println("the user lastname : " + last);
	 System.out.println("the user  bod  : " + bo);
	 System.out.println("the user   branch : " + branc );
	 System.out.println("the user  percentageOfPuc : " + per);
	 System.out.println("the user  percentageOfSslc : " + per1);
	 System.out.println("the user  cgpa : " + cgpa);
	 System.out.println("the user   phonenumber : " + phone);
	
	
	
	
}
}









