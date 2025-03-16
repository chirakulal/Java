class ColorRunner{
	public static void main(String[] args){
		Color color1 = new Color();
		
		String colorname = "red";
		Color color2 = new Color(colorname);
		System.out.println("the colorname is "+color2.colorname);
		
		String colorname1="yellow";
		String rgb1 = "255,255,0";
		Color color3 = new Color(colorname1,rgb1);
		System.out.println("the colorname is "+color3.colorname);
		System.out.println("the rbc is "+color3.rgb);
		
		String colorname2 = "blue";
		String rgb2="0,0,255";
		String hexacode2=" #0000FF";
		Color color4 = new Color(colorname2,rgb2,hexacode2);
		System.out.println("the colorname is "+color4.colorname);
		System.out.println("the rbc is "+color4.rgb);
		System.out.println("the hexacode is "+color4.hexacode);
		
		String colorname3 = "green";
		String rgb3="0,255,0";
		String hexacode3 = "#00FF00";
		int brightness3 = 30;
		Color color5 = new Color(colorname3,rgb3,hexacode3,brightness3);
		System.out.println("the colorname is "+color5.colorname);
		System.out.println("the rbc is "+color5.rgb);
		System.out.println("the hexacode is "+color5.hexacode);
		System.out.println("the brightness is "+color5.brightness);
		
		String colorname4 = "orange";
		String rgb4 = "255,165,0";
		String hexacode4=" #FFA500";
		int brightness4 =50;
		int saturation4 = 30;
	
		Color color6 = new Color(colorname4,rgb4,hexacode4,brightness4,saturation4);
		System.out.println("the colorname is "+color6.colorname);
		System.out.println("the rbc is "+color6.rgb);
		System.out.println("the hexacode is "+color6.hexacode);
		System.out.println("the brightness is "+color6.brightness);
		System.out.println("the saturation is "+color6.saturation);
		
		String colorname5 = "orange";
		String rgb5 = "255,165,0";
		String hexacode5=" #FFA500";
		int brightness5 =50;
		int saturation5 = 30;
		int cmykvalue5= 1000;
		Color color7 = new Color(colorname5,rgb5,hexacode5,brightness5);
		System.out.println("the colorname is "+color7.colorname);
		System.out.println("the rbc is "+color7.rgb);
		System.out.println("the hexacode is "+color7.hexacode);
		System.out.println("the brightness is "+color7.brightness);
		System.out.println("the saturation is "+color7.saturation);
		System.out.println("the cmykvalue is "+color7.cmykvalue);
	}
}