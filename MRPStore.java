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


}