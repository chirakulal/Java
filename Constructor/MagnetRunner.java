class MagnetRunner{

	public static void main(String[] args){
		String shape1 = "Disk";
		int strength1 = 500;
		double weight1 = 50.5;
		
		Magnet magnet1 = new Magnet(shape1,strength1,weight1);
		
		System.out.println("the shape of magnet is "+magnet1.shape);
		System.out.println("the strength of magnet "+magnet1.strength);
		System.out.println("the weight of is "+magnet1.weight);
		
		String shape2 = "block";
		int strength2 = 300;
		double weight2 = 75.5;
		
		Magnet magnet2 = new Magnet(shape2,strength2,weight2);
		
		System.out.println("the shape of magnet is "+magnet2.shape);
		System.out.println("the strength of magnet "+magnet2.strength);
		System.out.println("the weight of is "+magnet2.weight);
		
		String shape3 = "Sphere";
		int strength3 = 550;
		double weight3 = 30.8;
		
		Magnet magnet3 = new Magnet(shape3,strength3,weight3);
		
		System.out.println("the shape of magnet is "+magnet3.shape);
		System.out.println("the strength of magnet "+magnet3.strength);
		System.out.println("the weight of is "+magnet3.weight);
		
		String shape4 = "Ring";
		int strength4 = 600;
		double weight4 = 40.2;
		
		Magnet magnet4 = new Magnet(shape4,strength4,weight4);
		
		System.out.println("the shape of magnet is "+magnet4.shape);
		System.out.println("the strength of magnet "+magnet4.strength);
		System.out.println("the weight of is "+magnet4.weight);
		
		String shape5 = "Cube";
		int strength5 = 700;
		double weight5 = 50;
		
		Magnet magnet5 = new Magnet(shape5,strength5,weight5);
		
		System.out.println("the shape of magnet is "+magnet5.shape);
		System.out.println("the strength of magnet "+magnet5.strength);
		System.out.println("the weight of is "+magnet5.weight);
		
		
	}
}