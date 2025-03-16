class Doctor{
	static void treatment(String patientname, int age){
		System.out.println("The patient name "+patientname+" and age is "+age);
		Nurse.assist(patientname);
	}
}