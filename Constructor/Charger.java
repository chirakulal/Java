class Charger{
	
	String brand;
	int voltage;
	double price;
	
	Charger(String brand,int voltage,double price){
		this.brand= brand;
		this.voltage =voltage;
		this.price =price;
		System.out.println("parameter const is running");
	}
}