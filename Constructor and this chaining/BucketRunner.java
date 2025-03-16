class BucketRunner{
	public static void main(String[] args){
		Bucket bucket = new Bucket();
		
		String color = "red";
		Bucket bucket1 = new Bucket(color);
		System.out.println("the color is "+bucket1.color);
		
		String color2 = "red";
		String material2="plastic";
		Bucket bucket2 = new Bucket(color2,material2);
		System.out.println("the color is "+bucket2.color);
		System.out.println("the material is "+bucket2.material);
		
		String color3 = "red";
		String material3="plastic";
		String type3 = "Plastic";
		Bucket bucket3 = new Bucket(color3,material3,type3);
		System.out.println("the color is "+bucket3.color);
		System.out.println("the material is "+bucket3.material);
		System.out.println("the material is "+bucket3.type);
		
		String color4 = "red";
		String material4="plastic";
		String type4 = "Plastic";
		double weight4 = 0.50;
		Bucket bucket4 = new Bucket(color4,material4,type4,weight4);
		System.out.println("the color is "+bucket4.color);
		System.out.println("the material is "+bucket4.material);
		System.out.println("the type is "+bucket4.type);
		System.out.println("the weight is "+bucket4.weight);
		
		String color5 = "red";
		String material5="plastic";
		String type5 = "Plastic";
		double weight5 = 0.50;
		int height= 5;
		Bucket bucket5 = new Bucket(color5,material5,type5,weight5);
		System.out.println("the color is "+bucket5.color);
		System.out.println("the material is "+bucket5.material);
		System.out.println("the type is "+bucket5.type);
		System.out.println("the weight is "+bucket5.weight);
		System.out.println("the height is "+bucket5.height);
		
		String color6 = "red";
		String material6="plastic";
		String type6 = "Plastic";
		double weight6 = 0.50;
		int height6= 5;
		int capacity = 1;
		Bucket bucket6 = new Bucket(color6,material6,type6,weight6,height6);
		System.out.println("the color is "+bucket6.color);
		System.out.println("the material is "+bucket6.material);
		System.out.println("the type is "+bucket6.type);
		System.out.println("the weight is "+bucket6.weight);
		System.out.println("the height is "+bucket6.height);
		System.out.println("the height is "+bucket6.capacity);
	}
}