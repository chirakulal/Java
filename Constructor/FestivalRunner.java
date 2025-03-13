class FestivalRunner {
	
	public static void main (String[] args){
		
		String place = "Mangalore";
		String dresscode ="White";
		String festivalname = "holi";
		
		Festival festival1 = new Festival(place,dresscode,festivalname);
		System.out.println("the place of festival "+festival1.place);
		System.out.println("the dresscode for festival is "+festival1.dresscode);
		System.out.println("the festival name is "+festival1.festivalname);
		
		String place2 = "Mumbai";
		String dresscode2 = "traditional indian";
		String festivalname2 = "Marriage";
		
		Festival festival2 = new Festival (place2,dresscode2,festivalname2);
		System.out.println("the place of festival "+festival2.place);
		System.out.println("the dresscode for festival is"+festival2.dresscode);
		System.out.println("the festival name is "+festival2.festivalname);
		
		String place3 = "goa";
		String dresscode3 = "western";
		String festivalname3 = "new year party";
		
		Festival festival3 = new Festival (place3,dresscode3,festivalname);
		System.out.println("the place of festival "+festival3.place);
		System.out.println("the place for festival is "+festival3.dresscode);
		System.out.println("the festival name is "+festival3.festivalname);
		
		String place4 = "bangalore";
		String dresscode4 = "no dresscode";
		String festivalname4= "latern";
		
		Festival festival4 = new Festival(place,dresscode,festivalname);
		System.out.println("the place is festival "+festival4.place);
		System.out.println("the place for festival "+festival4.dresscode);
		System.out.println("the festival name is "+festival4.festivalname);
		
		String place5 = "london";
		String dresscode5 = "carnival";
		String festivalname5 = "halloween";
		
		Festival festival5 = new Festival(place,dresscode,festivalname);
		System.out.println("the place is festival "+festival5.place);
		System.out.println("the place for festival "+festival5.dresscode);
		System.out.println("the festival name is "+festival5.festivalname);
	}
}