class BalloonRunner{
	public static void main(String[] args){
		
		Balloon balloon1 = new Balloon();
		
		String color1 = "red";
		Balloon balloon2 = new Balloon(color1);
		System.out.println("the color of balloon is "+balloon2.color);
		
		String color2 = "yellow";
		String material2= "plastic";
		Balloon balloon3 = new Balloon(color2,material2);
		System.out.println("the color of balloon is "+balloon3.color);
		System.out.println("the material of balloon is "+balloon3.material);
		
		String color3 = "blue";
		String material3= "silicon";
		int waterDensity3 = 997;
		Balloon balloon4 = new Balloon(color3,material3,waterDensity3);
		System.out.println("the color of balloon is "+balloon4.color);
		System.out.println("the material of balloon is "+balloon4.material);
		System.out.println("the waterDensity of the balloon is "+balloon4.waterDensity);
		
		
	    String color4 = "black";
		String material4= "rubber";
		int waterDensity4 = 1000;
		int size4 = 10;
		Balloon balloon5 = new Balloon(color4,material4,waterDensity4,size4);
		System.out.println("the color of balloon is "+balloon5.color);
		System.out.println("the material of balloon is "+balloon5.material);
		System.out.println("the waterDensity of the balloon is "+balloon5.waterDensity);
		System.out.println("the size of the balloon is "+balloon5.size);
	
		String color5 = "white";
		String material5= "poliyurethen";
		int waterDensity5 = 989;
		int size5 = 12;
		double volume5 =0.5;
		Balloon balloon6 = new Balloon(color5,material5,waterDensity5,size5,volume5);
		System.out.println("the color of balloon is "+balloon6.color);
		System.out.println("the material of balloon is "+balloon6.material);
		System.out.println("the waterDensity of the balloon is "+balloon6.waterDensity);
		System.out.println("the size of the balloon is "+balloon6.size);
		System.out.println("the volume of the balloon is "+balloon6.volume);
		
		
		String color6 = "white";
		String material6= "poliyurethen";
		int waterDensity6 = 989;
		int size6 = 12;
		double volume6 =0.5;
		float mass6 = 1;
		Balloon balloon7 = new Balloon(color6,material6,waterDensity6,size6,volume6,mass6);
		System.out.println("the color of balloon is "+balloon7.color);
		System.out.println("the material of balloon is "+balloon7.material);
		System.out.println("the waterDensity of the balloon is "+balloon7.waterDensity);
		System.out.println("the size of the balloon is "+balloon7.size);
		System.out.println("the volume of the balloon is "+balloon7.volume);
		System.out.println("the mass of the balloon is "+balloon7.mass);
		
		
	}
}