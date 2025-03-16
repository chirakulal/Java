class HospitalRunner{
	public static void main(String[] args){
		System.out.println("Program started to run");
		String patientname = "radha";
		int age = 30;
		 long  mobile= 4536728;
		String email="radha@gmail.com";
		String sickness = "fever";
		Hospital.checkup(patientname,age,mobile,email,sickness);
	}
}