class Egg{
	String size;
	String shellsize;
	String yolkcolor;
	int thickness;
	int weight;
	int density;
	
	public Egg(){
		System.out.println("no-argu constructor is running");
		
	}
	public Egg(String size){
		this.size=size;
		System.out.println("one-argu constructor is running");
		
	}
	public Egg(String size,String shellsize){
		this(size);
		this.shellsize=shellsize;
		System.out.println("two-argu constructor is running");
		
	}
	public Egg(String size,String shellsize,String yolkcolor){
		this(size,shellsize);
		this.yolkcolor=yolkcolor;
		System.out.println("three-argu constructor is running");
		
	}
	public Egg(String size,String shellsize,String yolkcolor,int thickness){
		this(size,shellsize,yolkcolor);
		this.thickness=thickness;
		System.out.println("four-argu constructor is running");
		
	}
	public Egg(String size,String shellsize,String yolkcolor,int thickness,int weight){
		this(size,shellsize,yolkcolor,thickness);
		this.weight=weight;
		System.out.println("five-argu constructor is running");
		
	}
	public Egg(String size,String shellsize,String yolkcolor,int thickness,int weight,int density){
		this(size,shellsize,yolkcolor,thickness,weight);
		this.density=density;
		System.out.println("five-argu constructor is running");
		
	}
	
}