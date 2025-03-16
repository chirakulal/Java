class Hospital{
	static void checkup(String patienname, int age, long mobile, String email,String sickness){
		System.out.println("The patient details "+patienname+" "+age+" "+mobile+" "+email+" "+sickness);
		Doctor.treatment(patienname,age);
	}
}