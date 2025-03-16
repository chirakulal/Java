class Color{
	String colorname;
	String rgb;
	String hexacode;
	int brightness;
	int saturation;
	int cmykvalue;
	
	public Color(){
		System.out.println("no-argu constructor is running");
		
	}
	public Color(String colorname){
		this.colorname=colorname;
		System.out.println("one-argu constructor is running");
		
	}
	public Color(String colorname,String rgb){
		this(colorname);
		this.rgb =rgb;
		System.out.println("two-argu constructor is running");
		
	}
	public Color(String colorname,String rgb,String hexacode){
		this(colorname,rgb);
		this.hexacode=hexacode;
		System.out.println("three-argu constructor is running");
		
	}
	public Color(String colorname,String rgb,String hexacode,int brightness){
		this(colorname,rgb,hexacode);
		this.brightness=brightness;
		System.out.println("four-argu constructor is running");
		
	}
	public Color(String colorname,String rgb,String hexacode,int brightness,int saturation){
		this(colorname,rgb,hexacode,brightness);
		this.saturation=saturation;
		System.out.println("five-argu constructor is running");
		
	}
	public Color(String colorname,String rgb,String hexacode,int brightness,int saturation,int cmykvalue){
		this(colorname,rgb,hexacode,brightness,saturation);
		this.cmykvalue=cmykvalue;
		System.out.println("six-argu constructor is running");
		
	}

}