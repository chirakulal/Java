class Bucket{
	String color;
	String material;
	String type;
	double weight;
	int height;
	int capacity;
	
	
	
	public Bucket(){
		System.out.println("no-argu constructor is running");
		
	}
	public Bucket(String color){
		this.color =color;
		System.out.println("one-argu constructor is running");
		
	}
	public Bucket(String color,String material){
		this(color);
		this.material=material;
		System.out.println("two-argu constructor is running");
		
	}
	public Bucket(String color,String material,String type){
		this(color,material);
		this.type=type;
		System.out.println("three-argu constructor is running");
		
	}
	public Bucket(String color,String material,String type,double weight){
		this(color,material,type);
		this.weight=weight;
		System.out.println("four-argu constructor is running");
		
	}
	public Bucket(String color,String material,String type,double weight,int height){
		this(color,material,type,weight);
		this.height=height;
		System.out.println("five-argu constructor is running");
		
	}
	public Bucket(String color,String material,String type,double weight,int height,int capacity){
		this(color,material,type,weight,height);
		this.capacity=capacity;
		System.out.println("five-argu constructor is running");
		
	}
	
}