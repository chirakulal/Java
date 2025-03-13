class BarRunner{
	public static void main(String[] args){
		String name ="the night owl";
		String location ="bangalore";
		double rating = 4.5;
		
		Bar bar1 = new Bar(name,location,rating);
		
		System.out.println(bar1.name);
		System.out.println(bar1.location);
		System.out.println(bar1.rating);
		
		String name2 ="Sky lounge";
		String location2 ="mumbai";
		double rating2 = 4.3;
		
		Bar bar2 = new Bar(name2,location2,rating2);
		
		System.out.println(bar2.name);
		System.out.println(bar2.location);
		System.out.println(bar2.rating);
		
		String name3 ="the beer garden";
		String location3 ="delhi";
		double rating3 = 4.6;
		
		Bar bar3 = new Bar(name3,location3,rating3);
		
		System.out.println(bar3.name);
		System.out.println(bar3.location);
		System.out.println(bar3.rating);
		
		String name4 ="high spirit";
		String location4 ="pune";
		double rating4 = 4.3;
		
		Bar bar4 = new Bar(name4,location4,rating4);
		
		System.out.println(bar4.name);
		System.out.println(bar4.location);
		System.out.println(bar4.rating);
		
		String name5 ="irish house";
		String location5 ="Chennai";
		double rating5 = 4.5;
		
		Bar bar5 = new Bar(name,location,rating);
		
		System.out.println(bar5.name);
		System.out.println(bar5.location);
		System.out.println(bar5.rating);
		
	}

}