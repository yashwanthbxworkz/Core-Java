class JuiceShopRun{

public static void main(String[] agrs){

			boolean	juicenameadded	= JuiceShop.juiceNameAdded("mango juice");
			juicenameadded	= JuiceShop.juiceNameAdded("apple juice");
			juicenameadded	= JuiceShop.juiceNameAdded("orange juice");
			juicenameadded	= JuiceShop.juiceNameAdded("watermelon");
			juicenameadded	= JuiceShop.juiceNameAdded("strawberry");
			juicenameadded	= JuiceShop.juiceNameAdded("banana juice");
						if(juicenameadded)
						JuiceShop.showesJuicesNames();
						
								juicenameadded	= JuiceShop.deletedjuiceName("watermelon");
						boolean	updata	= JuiceShop.updateJuiceName("banana juice" ,"grapes");
						
						if(updata)
							JuiceShop.showesJuicesNames();
							
}


}