class Holi{
	
	String water;
	String music;
	String color;
	int peopleSize;
	String food;
	int duration;
	
	public Holi(){
		System.out.println("no-argu constructor is running");
		
	}
	public Holi(String water){
		this.water=water;
		System.out.println("one argument constructor is running");
		
	}
	public Holi(String water,String music){
		this(water);
		this.music=music;
		System.out.println("two argument constructoris running");
		
	}
	public Holi(String water,String music,String color){
		this(water,music);
		this.color=color;
		System.out.println("Three argument constructoris running");
		
	}
	public Holi(String water,String music,String color,int peopleSize){
		this(water,music,color);
		this.peopleSize=peopleSize;
		System.out.println("four argument constructoris running");
	}
	public Holi(String water,String music,String color,int peopleSize,String food){
		this(water,music,color,peopleSize);
		this.food=food;
		System.out.println("five argument constructoris running");
	}
	public Holi(String water,String music,String color,int peopleSize,String food,int duration){
		this(water,music,color,peopleSize,food);
		this.duration=duration;
		System.out.println("six argument constructoris running");
	}
}