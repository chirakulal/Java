class Fooditem{
	static void eat(String foodname){
		System.out.println(foodname);
	}
	static void buy(String itemname , double prize){
		System.out.println(itemname+" " +prize);
	}
	static void buyburger(int quantity){
		System.out.println(quantity);
	}
	static void menu(String menus, Double amount, int quantity){
		System.out.println(menus+" "+amount+" "+quantity);
	}
	static void buyfood(double prize){
		System.out.println(prize);
	}
	static void expireDate(String expirydate, String manufacturedate, boolean expired){
		System.out.println(expirydate+" "+manufacturedate+" "+expired);
	}
	static void serve(String dishname, int platecount ){
		System.out.println(dishname+" "+platecount);
	}
}