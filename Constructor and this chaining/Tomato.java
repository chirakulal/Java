class Tomato{
	
	int size;
	int weight;
	String color;
	String shape;
	String type;
	int content;
	
	public Tomato(){
		System.out.println("no-argu constructor is running");
		
	}
	public Tomato(int size){
		this.size=size;
		System.out.println("one-argu constructor is running");
		
	}
	public Tomato(int size,int weight){
		this(size);
		this.weight=weight;
		System.out.println("two-argu constructor is running");
		
	}
	public Tomato(int size,int weight,String color){
		this(size,weight);
		this.color=color;
		System.out.println("three-argu constructor is running");
		
	}
	public Tomato(int size,int weight,String color,String shape){
		this(size,weight,color);
		this.shape=shape;
		System.out.println("four-argu constructor is running");
		
	}
	public Tomato(int size,int weight,String color,String shape,String type){
		this(size,weight,color,shape);
		this.type=type;
		System.out.println("five-argu constructor is running");
		
	}
	public Tomato(int size,int weight,String color,String shape,String type,int content){
		this(size,weight,color,shape,type);
		this.content=content;
		System.out.println("five-argu constructor is running");
		
	}
}