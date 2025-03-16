class Courier{
	static void pickup(String items){
		System.out.println("Courier is sent and the items is "+items);
		Station.send(items);
	}
}