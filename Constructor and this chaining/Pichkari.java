class Pichkari{
	String color;
	double weight;
	String grip;
	int speed;
	String mode;
	int durability;
	
	public Pichkari(){
		System.out.println("no-argu constructor is running");
	}
	public Pichkari(String color){
		this.color=color;
		System.out.println("one-argu constructor is running");
	}
	public Pichkari(String color,double weight){
		this(color);
		this.weight=weight;
		System.out.println("two-argu constructor is running");
	}
	public Pichkari(String color,double weight,String grip){
		this(color,weight);
		this.grip=grip;
		System.out.println("three-argu constructor is running");
	}
	public Pichkari(String color,double weight,String grip,int speed){
		this(color,weight,grip);
		this.speed=speed;
		System.out.println("four-argu constructor is running");
	}
	public Pichkari(String color,double weight,String grip,int speed,String mode){
		this(color,weight,grip,speed);
		this.mode=mode;
		System.out.println("five-argu constructor is running");
	}
	public Pichkari(String color,double weight,String grip,int speed,String mode,int durability){
		this(color,weight,grip,speed,mode);
		this.durability=durability;
		System.out.println("six-argu constructor is running");
	}
	

	
}