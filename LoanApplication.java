class LoanApplication{
	 
	 
	 
	
	static String box;
	static String box1; 
	static String box2;
	static String box3 ;
	static  String box4;
	static String box5 ;
	static String box6 ;
	static String box7 ;
	static String  box8;


		public static boolean register(String desiredLoanAmount, String annualIncome ,String name , String dob ,String maritalStatus ,
										String addres , String Occupation , String grossmonthlyincome , String bankReferences){
					boolean isregisterd = false;					
						boolean isdesiredLoanAmountInvalid = false;
							if(desiredLoanAmount != null){
								box = desiredLoanAmount;
								isdesiredLoanAmountInvalid = true;
							}else {
								System.out.println("the desiredLoanAmount is invalid");
							}
							boolean isannualIncomeInvalid = false;
							if(annualIncome != null){
								box1 = annualIncome;
								isannualIncomeInvalid = true;
							}else {
								System.out.println("the annualIncome is Invalid");
								
							}
							boolean isnameInvalid = false;
							if(name != null){
								box2 = name;
								isnameInvalid = true;
							}else {
								System.out.println("the name invalid");
							}
							boolean isdobInvaild = false;
							if(dob != null){
								box3 = dob;
								isdobInvaild = true;
							}else{
								System.out.println("the dob is Ivalid");
							}
										
									boolean ismaritalStatusInvalid = false;
													if(maritalStatus != null){
														box4 = maritalStatus;
														ismaritalStatusInvalid = true;
														
													}else {
														System.out.println("the maritalStatus is invalid");
													}
										boolean isaddresInvalid = false;
										if(addres !=null){
											box5 = addres;
											isaddresInvalid = true;
										}else{
											System.out.println("the addres is Invalid");
										}
										boolean isOccupationInvaild = false;
										if(Occupation != null){
											box6 = Occupation;
											isOccupationInvaild= true;
										}else{
											System.out.println("the Occupation is Invalid");
										}
										boolean isgrossmonthlyincomeInvalid = false;
										if(grossmonthlyincome != null){
											box7 = grossmonthlyincome;
											isgrossmonthlyincomeInvalid = true;
										}else{
											System.out.println("the grossmonthlyincome is Invalid");
										}
										boolean isbankReferencesInvalid = false;
										if(bankReferences != null){
											box8 = bankReferences;
											isbankReferencesInvalid = true;
										}else{
											System.out.println("the bankReferences is invalid");
										}
										box =  desiredLoanAmount; 
										box1 =  annualIncome; 
										box2 =  name;
										box3 = dob;
										box4 =  maritalStatus;
										box5 = addres;
										box6 = Occupation;
										box7 = grossmonthlyincome;
										box8 = bankReferences;
										
							if(isdesiredLoanAmountInvalid == true && isannualIncomeInvalid == true && isnameInvalid == true&&isdobInvaild==true && ismaritalStatusInvalid==true
									&& isaddresInvalid == true && isOccupationInvaild == true&&isgrossmonthlyincomeInvalid && isbankReferencesInvalid== true)isregisterd = true;		
										return isregisterd;
										}

			public static void readregister(){

			System.out.println("fetching... use details");



                          System.out.println("the user desiredLoanAmount:" +box); 
                          System.out.println("the user annualIncome: "  +box1);
                          System.out.println("the user name: " +box2);
                          System.out.println("the user dod: "  +box3);
                          System.out.println("the user maritalStatus: " +box4);
                          System.out.println("the user addres: " +box5);
                          System.out.println("the user Occupation: "  +box6);
                          System.out.println("the user grossmonthlyincome:"+ box7);
                          System.out.println("the user bank References: "  +box8);
               }
}			   