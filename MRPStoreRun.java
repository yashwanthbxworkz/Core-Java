class MRPStoreRun{

public static void main(String[] agrs){

		boolean name = MRPStore.searchalcoholes("Hennessy");
		name = MRPStore.searchalcoholes("Johnnie Walker");
		name = MRPStore.searchalcoholes("Absolut");
		name = MRPStore.searchalcoholes("Budweiser");
		name = MRPStore.searchalcoholes("Jack Daniel's");
		name = MRPStore.searchalcoholes("Smirnoff");
		name = MRPStore.searchalcoholes("Captain Morgan Rum");
		name = MRPStore.searchalcoholes("Grey Goose");
		name = MRPStore.searchalcoholes("Jameson");
		name = MRPStore.searchalcoholes("Corona ");
		name = MRPStore.upDataMRPStore("Jameson", "van");
				name	=MRPStore.deletingMRPStore("Absolut");
		if(name){
			MRPStore.readalocholnames();
		
		
		}

}


}