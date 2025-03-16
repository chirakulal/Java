class BakeryRunner{
	public static void main(String[] args){
		String productname = "Sugar";
		int weigh = 500;
		Bakery.buy(productname,weigh);
		
		boolean value = true;
		Bakery.open(value);
		
		boolean yesorno = false;
		Bakery.close(yesorno);
		
		String Noun = "Thushara";
		Bakery.owner(Noun);
		
		String name = "diya";
		Bakery.cashier(name);
		
		
	}
}