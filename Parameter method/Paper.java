class Paper{
	static void fold(String name){
		System.out.println(name);
	}
	static void write(int fontsize){
		System.out.println(fontsize);
	}
	static void print(boolean needtoprint){
		System.out.println(needtoprint);
	}
	static void recycle(String papertype, double amount){
		System.out.println(papertype+" " + amount);
	}
	static void sell(String papername, int prize ){
		System.out.println(papername+" "+prize);
	}
	static void bind(String bookTitle, int pages, boolean hardcover) 
	{
		System.out.println(bookTitle+" "+pages+" "+hardcover);
	}
	static void color(String paperType, String color, boolean waterproof)
	{
		System.out.println(paperType+" "+color+" "+waterproof);
	}
}