class FoodRunner{
	
	public static void main(String[] args){
		System.out.println("Programme started");
		String[] items = Food.items(Fooditems.CHAPATHI);
		for(String ref:items)
		{
			System.out.println(ref);
		}
	}
}