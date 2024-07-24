class MedicalStore{
static int index;
		static	String medicineNames[] = {null,null,null,null,null,"r",null,null,null,null};
			public static boolean searchmedicinename(String nameOfMedicine){
				boolean issearching = false;
				if(nameOfMedicine != null){
				medicineNames[index++]= nameOfMedicine;
				issearching = true;
				
				}
			
			
			
			return issearching;
			
			}
			

public static void readmedicinename(){
for(String medicineName:medicineNames){

System.out.println("the medicine Name is :" + medicineName);
}



}


}