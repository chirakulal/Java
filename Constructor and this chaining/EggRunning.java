class EggRunning{
	
	public static void main(String[] args){
		Egg egg = new Egg();
		
	    String size ="small";
		Egg egg1 = new Egg(size);
		System.out.println("the egg size is "+egg1.size);
		
		String size1 ="small";
		String shellsize1="white" ;
		Egg egg2 = new Egg(size1,shellsize1);
		System.out.println("the egg size is "+egg2.size);
		System.out.println("the egg shellsize is "+egg2.shellsize);
		
		String size2 ="small";
		String shellsize2="white" ;
		String yolkcolor2 = "yellow";
		Egg egg3 = new Egg(size2,shellsize2,yolkcolor2);
		System.out.println("the egg size is "+egg3.size);
		System.out.println("the egg shellsize is "+egg3.shellsize);
		System.out.println("the egg yolkcolor is "+egg3.yolkcolor);
		
		String size3 ="small";
		String shellsize3="white" ;
		String yolkcolor3 = "yellow";
		int thickness3=2;
		Egg egg4 = new Egg(size3,shellsize3,yolkcolor3,thickness3);
		System.out.println("the egg size is "+egg4.size);
		System.out.println("the egg shellsize is "+egg4.shellsize);
		System.out.println("the egg yolkcolor is "+egg4.yolkcolor);
		System.out.println("the egg thickness is "+egg4.thickness);
		
		String size4 ="small";
		String shellsize4="white" ;
		String yolkcolor4 = "yellow";
		int thickness4=2;
		int weight4 = 4;
		Egg egg5 = new Egg(size4,shellsize4,yolkcolor4,thickness4,weight4);
		System.out.println("the egg size is "+egg5.size);
		System.out.println("the egg shellsize is "+egg5.shellsize);
		System.out.println("the egg yolkcolor is "+egg5.yolkcolor);
		System.out.println("the egg thickness is "+egg5.thickness);
		System.out.println("the egg weight is "+egg5.weight);
		
		String size5="small";
		String shellsize5="white" ;
		String yolkcolor5 = "yellow";
		int thickness5=2;
		int weight5 = 4;
		int density5=1;
		Egg egg6 = new Egg(size5,shellsize5,yolkcolor5,thickness5,weight5,density5);
		System.out.println("the egg size is "+egg6.size);
		System.out.println("the egg shellsize is "+egg6.shellsize);
		System.out.println("the egg yolkcolor is "+egg6.yolkcolor);
		System.out.println("the egg thickness is "+egg6.thickness);
		System.out.println("the egg weight is "+egg6.weight);
		System.out.println("the egg weight is "+egg6.density);
		
	}
}