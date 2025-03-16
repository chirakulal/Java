class Beer{
	static void pour(String brand) {
		System.out.println(brand);
	}
	static void open(boolean isCarbonated) {
		System.out.println(isCarbonated);
	}
	static void serve(String glassType) {
		System.out.println(glassType);
	}
	static void mix(String beerType, String otherDrink) {
		System.out.println(beerType+" "+otherDrink);
	}
	static void rateTaste(String brand, int rating) {
		System.out.println(brand+" "+rating);
}
	static void store(String brand, int temperature, boolean upright) {
		System.out.println(brand+" "+temperature+" "+upright);
	}
	static void drink(String brand, int sips, boolean enjoy) {
		System.out.println(brand+" "+sips+" "+enjoy);
	}

}