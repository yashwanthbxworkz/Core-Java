import java.util.*;
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
				public static boolean upDataingAmazonProudct(String oldProduct , String newProduct){
					boolean isupDataing = false;
					for(int position = 0; position<productname.length; position++){
						if(productname[position]== oldProduct){
							productname[position]=newProduct;
							isupDataing = true;
						}
							
						
					}
					if(isupDataing == false)
					System.out.println(oldProduct + " :not found");

					return isupDataing;
				}
				public static boolean deletedproductname(String deleted){
					boolean isdeleting = false;
					int position,newposition;
					for(position = 0,newposition=0; position<productname.length;position++){
						if(productname[position]!= deleted){
							productname[newposition] = productname[position];
							newposition++;
							
						}else 
							isdeleting = true;
					}
					
					productname = Arrays.copyOf(productname, newposition);
					return isdeleting;
				}
}