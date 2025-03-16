class Icc{
	static void worldCup(){
		conductMeeting();
		System.out.println("Oraganizing world cup");
	}
	static void conductMeeting(){
		regulatecricket();
		System.out.println("Conducting ICC meeting");
	}
	static void regulatecricket(){
		handleUmpires();
		System.out.println("Regulating cricket rules");
	}
	static void handleUmpires(){
		setMatch();
		System.out.println("managing umpires");
	}
	static void setMatch(){
		Rcb.playMatch();
		System.out.println("Set Match Schedules");
	}
	static void developFormats() {
		Rcb.analyzePerformance();
		System.out.println("Developing new match formats");
		}
    static void implementTechnology() { 
		Rcb.interactWithFans();
		System.out.println("Implementing technology in cricket"); 
	}
    static void maintainPlay() {
		Rcb.strategizeGameplay();		
		System.out.println("Ensuring fair play in matches");
	}
	static void invoking(){
	IplCup.fetchData();
	IplCup.processRequest();
	IplCup.validateInput();
	}
}