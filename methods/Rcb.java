class Rcb{
	static void playMatch(){
		hireCoach();
		System.out.println("RCB is playing");
	}
	static void hireCoach(){
		sponser();
		System.out.println("Hiring a new coach");
	}
	static void sponser(){
		trainplayers();
		System.out.println("companies sponser RCB team");
	}
	static void trainplayers(){
		buyPlayers();
		System.out.println("Training players of RCB");
	}
	static void buyPlayers(){
		
		System.out.println("Buying players inauction");
	}
	static void analyzePerformance() { 
		IplCup.annonceWinner();
		System.out.println("Analyzing team performance"); 
	 }
    static void interactWithFans() { 
		IplCup.sendNotification();
		System.out.println("Interacting with fans"); 
	}
    static void strategizeGameplay() { 
		IplCup.logEvent();
		System.out.println("Strategizing for upcoming matches"); 
	}
	
}