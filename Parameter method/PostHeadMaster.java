class PostHeadMaster{
	static void deliver(String customername, String address){
		System.out.println("The post of "+customername+"and the location is "+address+" is delivered");
		PostMaster.deliver(customername,address);
	}
	
}