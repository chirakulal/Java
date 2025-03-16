class Station{
	static void send(String item){
		System.out.println("Item is delivered to Station and the items is "+item);
		DeliveryGuy.accept(item);
	}
}