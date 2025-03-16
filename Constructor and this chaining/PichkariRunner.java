class PichkariRunner{
	public static void main(String[] args){
		Pichkari pichkari = new Pichkari();

		String color1="red";
		Pichkari pichkari1 = new Pichkari(color1);
		System.out.println("the color is "+pichkari1.color);
		
		String color2="red";
		double weight2=0.2;
		Pichkari pichkari2 = new Pichkari(color2,weight2);
		System.out.println("the color is "+pichkari2.color);
		System.out.println("the color is "+pichkari2.weight);
		
		String color3="red";
		double weight3=0.2;
		String grip3="Smooth";
		Pichkari pichkari3 = new Pichkari(color3,weight3,grip3);
		System.out.println("the color is "+pichkari3.color);
		System.out.println("the color is "+pichkari3.weight);
		System.out.println("the color is "+pichkari3.grip);
		
		
		
		String color4="red";
		double weight4=0.2;
		String grip4="Smooth";
		int speed4= 5;
		Pichkari pichkari4 = new Pichkari(color4,weight4,grip4,speed4);
		System.out.println("the color is "+pichkari4.color);
		System.out.println("the color is "+pichkari4.weight);
		System.out.println("the color is "+pichkari4.grip);
		System.out.println("the color is "+pichkari4.speed);
		
		
		
		String color5="red";
		double weight5=0.2;
		String grip5="Smooth";
		int speed5= 5;
		String mode5="single stream";
		Pichkari pichkari5 = new Pichkari(color5,weight5,grip5,speed5,mode5);
		System.out.println("the color is "+pichkari5.color);
		System.out.println("the weight is "+pichkari5.weight);
		System.out.println("the grip is "+pichkari5.grip);
		System.out.println("the speed is "+pichkari5.speed);
		System.out.println("the mode is "+pichkari5.mode);
		
		String color6="red";
		double weight6=0.2;
		String grip6="Smooth";
		int speed6= 5;
		String mode6="single stream";
		int durability6=2;
		Pichkari pichkari6 = new Pichkari(color6,weight6,grip6,speed6,mode6,durability6);
		System.out.println("the color is "+pichkari6.color);
		System.out.println("the weight is "+pichkari6.weight);
		System.out.println("the grip is "+pichkari6.grip);
		System.out.println("the speed is "+pichkari6.speed);
		System.out.println("the mode is "+pichkari6.mode);
		System.out.println("the mode is "+pichkari6.durability);
		
	}
}