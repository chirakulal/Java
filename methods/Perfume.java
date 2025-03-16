class Perfume{
	static void spray(){
		System.out.println("method29 spray is running");
	}static void fragrance(){
		System.out.println("method30 fragrance is running");
		smell();
	}
	static void smell(){
		System.out.println("method31 smell is running");
		flower();
	}
	static void flower(){
		System.out.println("method32 flower is running");
		Wallet.collectmoney();
		Wallet.keepnote();
	}
}