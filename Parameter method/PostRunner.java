class PostRunner{
	public static void main(String[] args){
		System.out.println("Programme Postrunner started running");
		String customername = "yahvi";
		String address = "banglore";
		AreaPostOffice.deliver(customername,address);
	}
}