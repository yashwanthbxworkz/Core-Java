class AmazonProduct{
	static	String productname[] = {null,null,null,null,null,null,null,null,null,null};
		static  int index;
		
			public static boolean searchproduct(String nameOfProduct){
			boolean isfinding = false;
			if(index<productname.length){
					if(nameOfProduct != null){
							productname[index] = nameOfProduct;
							index++;
							isfinding = true;
					}
					else System.out.println("the product name is invalid ");
			}else
				System.out.println("the product name is not out of range");
			
			
			return isfinding;
			} 


				public static void readamazonproduct(){
				
				for(String productnamed: productname){
				System.out.println("the amazon product name is:" + productnamed);
				
				}
				
				
				}
}