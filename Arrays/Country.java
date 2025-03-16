class Country{
	public static void countryname(String[] cont){
		for(String ref:cont){
			if(ref.endsWith("a")||ref.endsWith("A")){
			System.out.println(ref);
			}
		}
	}
	
}