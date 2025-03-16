class TomatoRunner{
	public static void main(String[] args){
		Tomato tomato = new Tomato();
		
		int size = 2;
		Tomato tomato1 = new Tomato(size);
		System.out.println("theb size of tomatos is "+tomato1.size);
		
		int size2 = 2;
		int weight2 = 20;
		Tomato tomato2 = new Tomato(size2,weight2);
		System.out.println("the size of tomatos is "+tomato2.size);
		System.out.println("the weight of tomatos is "+tomato2.weight);
		
		int size3 = 2;
		int weight3 = 20;
		String color3 ="red";
		Tomato tomato3 = new Tomato(size3,weight3,color3);
		System.out.println("the size of tomatos is "+tomato3.size);
		System.out.println("the weight of tomatos is "+tomato3.weight);
		System.out.println("the color of tomatos is "+tomato3.color);
		
		int size4 = 2;
		int weight4 = 20;
		String color4 ="red";
		String shape4 = "round";
		Tomato tomato4 = new Tomato(size4,weight4,color4,shape4);
		System.out.println("the size of tomatos is "+tomato4.size);
		System.out.println("the weight of tomatos is "+tomato4.weight);
		System.out.println("the color of tomatos is "+tomato4.color);
		System.out.println("the shape of tomatos is "+tomato4.shape);
		
		int size5= 2;
		int weight5 = 20;
		String color5 ="red";
		String shape5 = "round";
		String type5="cherry tomato";
		Tomato tomato5 = new Tomato(size5,weight5,color5,shape5,type5);
		System.out.println("the size of tomatos is "+tomato5.size);
		System.out.println("the weight of tomatos is "+tomato5.weight);
		System.out.println("the color of tomatos is "+tomato5.color);
		System.out.println("the shape of tomatos is "+tomato5.shape);
		System.out.println("the type of tomatos is "+tomato5.type);
		
		int size6= 2;
		int weight6 = 20;
		String color6 ="red";
		String shape6 = "round";
		String type6="cherry tomato";
		int content6 = 80;
		Tomato tomato6 = new Tomato(size6,weight6,color6,shape6,type6,content6);
		System.out.println("the size of tomatos is "+tomato6.size);
		System.out.println("the weight of tomatos is "+tomato6.weight);
		System.out.println("the color of tomatos is "+tomato6.color);
		System.out.println("the shape of tomatos is "+tomato6.shape);
		System.out.println("the type of tomatos is "+tomato6.type);
		System.out.println("the content of tomatos is "+tomato6.content);
	}
}