class HoliRunner{
	public static void main(String[] args){
		Holi holi1 = new Holi();
		
		String water1 = "5liter";
		Holi holi2 = new Holi(water1);
		System.out.println("the watercapacity is "+holi2.water);
		
		String water2 = "10liter";
		String music2="bollywood";
		Holi holi3 = new Holi(water2,music2);
		System.out.println("the watercapacity is "+holi3.water);
	    System.out.println("the music is "+holi3.music);

		
		String water3 = "10liter";
		String music3="traditional";
		String color3 = "red";
		Holi holi4 = new Holi(water3,music3,color3);
		System.out.println("the watercapacity is "+holi4.water);
	    System.out.println("the music is "+holi4.music);
		System.out.println("the color is "+holi4.color);

		String water4= "15liter";
		String music4="western";
		String color4 = "yellow";
		int peopleSize4 = 100;
		Holi holi5 = new Holi(water4,music4,color4,peopleSize4);
		System.out.println("the watercapacity is "+holi5.water);
	    System.out.println("the music is "+holi5.music);
		System.out.println("the color is "+holi5.color);
		System.out.println("the peopleSize is "+holi5.peopleSize);
	
		String water5= "20liter";
		String music5="western";
		String color5 = "yellow";
		int peopleSize5 = 200;
		String food5= "Gujiya";
		Holi holi6 = new Holi(water5,music5,color5,peopleSize5,food5);
		System.out.println("the watercapacity is "+holi6.water);
	    System.out.println("the music is "+holi6.music);
		System.out.println("the color is "+holi6.color);
		System.out.println("the peopleSize is "+holi6.peopleSize);
		System.out.println("the food is "+holi6.food);
		
		String water6= "25liter";
		String music6="western";
		String color6 = "yellow";
		int peopleSize6 = 300;
		String food6= "Thandai";
		int duration6=3;
		Holi holi7 = new Holi(water6,music6,color6,peopleSize6,food6,duration6);
		System.out.println("the watercapacity is "+holi7.water);
	    System.out.println("the music is "+holi7.music);
		System.out.println("the color is "+holi7.color);
		System.out.println("the peopleSize is "+holi7.peopleSize);
		System.out.println("the food is "+holi7.food);
		System.out.println("the duration is "+holi7.duration);
	
	}
}