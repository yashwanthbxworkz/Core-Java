class AmazonProductRun{
		
			public static void main(String[] agrs){
			
			
	boolean	product	= AmazonProduct.searchproduct("samsung");
				product	= AmazonProduct.searchproduct("dell");
				product	= AmazonProduct.searchproduct("ipad");
				product	= AmazonProduct.searchproduct("comforters");
				product	= AmazonProduct.searchproduct("pans");
				product	= AmazonProduct.searchproduct("coffee makers");
				product	= AmazonProduct.searchproduct("conditioner");
				product	= AmazonProduct.searchproduct("perfuns");
				product	= AmazonProduct.searchproduct("fiction");
				product	= AmazonProduct.searchproduct("dvd");
				
				if(product){
				AmazonProduct.readamazonproduct();
				}
			
			
			}




}