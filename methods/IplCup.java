class IplCup{
	static void annonceWinner(){
		manageSponserships();
		System.out.println("Ipl winner annoced");
	}
	static void manageSponserships(){
		oraganizeteams();
		System.out.println("Ipl manages the Sponserships");
	}
	static void oraganizeteams(){
		sellMerchandise();
		System.out.println("teams are organized");
	}
	static void sellMerchandise(){
		scheduleMatches();
		System.out.println("Selling ipl merchandise");
	}
	static void scheduleMatches(){
		System.out.println("Matches are scheduled");
	}
	static void logEvent(){ 
	System.out.println("Logging event"); 
	}
	 static void sendNotification(){ 
	 System.out.println("Sending notification"); 
	 }
   static void fetchData(){ 
   System.out.println("Fetching data"); 
   }
   static  void processRequest(){ 
   System.out.println("Processing request"); 
   }
    static void validateInput(){ 
	System.out.println("Validating input");
	}
}