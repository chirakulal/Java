class Balloon{
	
	String color;
	String material;
	int waterDensity;
	int size;
	double volume;
	float mass;
	
     public Balloon(){
		 System.out.println("no-argu constructor is running");
	 }
	 public Balloon(String color){
		 this.color = color;
		 System.out.println("one agrumente constructor is running");
	 }
	 public Balloon(String color,String material){
		 this(color);
		 this.material=material;
		 System.out.println("two argument constructor is running");
	 }
	 public Balloon(String color,String material,int waterDensity){
		 this(color,material);
		 this.waterDensity=waterDensity;
		 System.out.println("three argument constructor is running");
		 
	 }
	 public Balloon(String color,String material,int waterDensity,int size){
			this(color,material,waterDensity);
			this.size =size;
			System.out.println("four argument constructor is running");
	 }
	 public Balloon (String color,String material,int waterDensity,int size,double volume){
		 this(color,material,waterDensity,size);
		 this.volume=volume;
		 System.out.println("five argument constructor is running");
	 }
	 public Balloon(String color,String material,int waterDensity,int size,double volume,float mass){
		 this(color,material,waterDensity,size,volume);
		  this.mass = mass;
		  System.out.println("six argument parameter is running");
	 }
}
