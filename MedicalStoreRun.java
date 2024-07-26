class MedicalStoreRun{
		
		public static void main (String[] agrs){


			boolean	name	=	MedicalStore.searchmedicinename("heloset");
					name	=	MedicalStore.searchmedicinename("Costco Pharmacy");
					name	=	MedicalStore.searchmedicinename("Walmart Pharmacy");
					name	=	MedicalStore.searchmedicinename("Publix Pharmacy");
					name	=	MedicalStore.searchmedicinename("Walgreens");
					name	=	MedicalStore.searchmedicinename("Rite Aid");
					name	=	MedicalStore.searchmedicinename("Giant Eagle Pharmacy");
					name	=	MedicalStore.searchmedicinename("CVS Pharmacy");
					name	=	MedicalStore.searchmedicinename("kroger Pharmacy");
					name	=	MedicalStore.searchmedicinename("arget Pharmacy");
					name 	= 	MedicalStore.upDataingMedicalStore("Rite Aid", "dolo");
					name 	= 	MedicalStore.deletedMedicalStore("Publix Pharmacy");
					System.out.println(name);
						if(name)
							MedicalStore.readmedicinename();


}
}