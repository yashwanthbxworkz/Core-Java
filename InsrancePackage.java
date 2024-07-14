class InsrancePackage{
	
				static double ref = 0.0;
				public static double getPrice(String insranceName){
				
						if(insranceName == "hdf life insrance"){              //1 if
                                  ref = 6000.0;
								return ref;
						
						}			
						
						if(insranceName == "max life"){							//2if
									ref = 7000.0;
								return ref;
						
						}
						
						if(insranceName == "icc life insrance"){ 
								   ref = 4000.0;									//3if
								return ref;
									
									
									}
						if(insranceName == "kotak lif insrance"){             //4if
										ref = 5000.0;
									return ref;
									
									}
						
						
						
						
							else{
                              System.out.println( insranceName +" not found ");								
								
							}
						
						
						
						
						return 0.0;
						}
				
	



}