import java.util.*;
class MRPStore{ 

static int index;
static String alcoholNames[] = {null,null,null,null,null,null,null,null,null,null};
		public static boolean searchalcoholes(String namesOfalcohols){
		boolean isfinding = false;
		if(namesOfalcohols != null){
			alcoholNames[index++] = namesOfalcohols;
			isfinding= true;
			
		
		}
		
		return isfinding;
		
		}


public static void readalocholnames(){


		for(String alcoholName: alcoholNames){
		System.out.println("the alcoholName is : " + alcoholName);
		}

}
		public static boolean upDataMRPStore(String oldAlcohol, String newAlcohol){
			boolean isupdataing = false;
			for(int position = 0 ; position<alcoholNames.length;position++){
				if(alcoholNames[position] == oldAlcohol){
					alcoholNames[position] = newAlcohol;
					isupdataing = true;
				}
				
				}
				if(isupdataing == false)
					System.out.println(oldAlcohol + "not found");
				return isupdataing ;
			}
				public static boolean deletingMRPStore(String deleted){
					boolean isdeleting = false;
					int position, newposition;
					for(position=0, newposition=0;position<alcoholNames.length;position++){
						if(alcoholNames[position]!= deleted){
							alcoholNames[newposition] = alcoholNames[position];
							newposition++;
							isdeleting = true;
							
						}else
							 
							isdeleting = false;
					}
					
					alcoholNames = Arrays.copyOf(alcoholNames, newposition);
					return isdeleting;
				}
		}


