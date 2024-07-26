import java.util.*;
class MedicalStore{
static int index;
		static	String medicineNames[] = {null,null,null,null,null,null,null,null,null,null};
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
			public static boolean upDataingMedicalStore(String oldmedicine , String newmedicine){
				boolean isupdataing = false;
				for(int position = 0; position<medicineNames.length; position++){
					if(medicineNames[position]== oldmedicine){
						medicineNames[position] = newmedicine;
						isupdataing = true;
					}
				}
				if(isupdataing== false)
					System.out.println(oldmedicine + " :not found");
				return isupdataing ;
				
			}
			public static boolean deletedMedicalStore(String deleted){
				boolean isdeleting = false;
				int position, newposition;
				for(position=0,newposition=0;position<medicineNames.length;position++){
					if(medicineNames[position]!= deleted){
						medicineNames[newposition]=medicineNames[position];
						newposition++;
						isdeleting = true;
					}else
						isdeleting = false;
				}
				medicineNames=Arrays.copyOf(medicineNames, newposition);
				return isdeleting;
			}


}