class WhatsappRunner{
	public static void main(String[] args){
		String version = "2.23";
		double user = 2.5;
		int year =2009;
		
		Whatsapp whatsapp1 = new Whatsapp(version,user,year);
		System.out.println("version is "+whatsapp1.version);
		System.out.println("user is "+whatsapp1.user);
		System.out.println("year is "+whatsapp1.year);
		
		String version2 = "2.22";
		double user2 = 2.3;
		int year2 = 2009;
		
		Whatsapp whatsapp2 = new Whatsapp(version2,user2,year2);
		System.out.println("version is "+whatsapp2.version);
		System.out.println("user is "+whatsapp2.user);
		System.out.println("year is "+whatsapp2.year);
		
		String version3 = "2.33";
		double user3 = 3;
		int year3 = 2010;
		
		Whatsapp whatsapp3 = new Whatsapp(version3,user3,year3);
		System.out.println("version is "+whatsapp3.version);
		System.out.println("user is "+whatsapp3.user);
		System.out.println("year is "+whatsapp3.year);
		
		String version4 = "3";
		double user4 = 3.2;
		int year4 = 2011;
		
		Whatsapp whatsapp4=  new Whatsapp(version4,user4,year4);
		System.out.println("version is "+whatsapp4.version);
		System.out.println("user is "+whatsapp4.user);
		System.out.println("year is "+whatsapp4.year);
		
		String version5 = "3.4";
		double user5 = 3.5;
		int year5 = 2011;
		
		Whatsapp whatsapp5 = new Whatsapp(version5,user5,year5);
		
		System.out.println("version is "+whatsapp5.version);
		System.out.println("user is "+whatsapp5.user);
		System.out.println("year is "+whatsapp5.year);
		
		
	}
}