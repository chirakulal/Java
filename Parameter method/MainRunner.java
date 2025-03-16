class MainRunner{
	public static void main(String[] args){
		System.out.println("Programe started to Run");
		
		String name="thushara";
		Ladder.climb(name);
		
		int num = 25;
		Ladder.size(num);
		
		double money = 10000;
		Ladder.buy(money);
		
		boolean yesorno=true;
		char letter = 'a';
		Ladder.climbtree(yesorno,letter);
		
		Double amount = 20000.0;
		long size = 30;
		Ladder.climbulding(amount,size);
		
		
		String name1 = "tina";
		double phoneno = 14536278;
		double salary = 30000;
		Ladder.workername( name1,phoneno,salary );
		
		int size1 =10;
		double amount1=5000;
		String address="gdushdk";
		Ladder.sell(size1,amount1,address);
		
         System.out.println("------------------------------------");
		 
		 String foodname="Burger";
		 Fooditem.eat( foodname);
		 
		 String itemname = "Dosa";
		 double prize2=30;
		 Fooditem.buy(itemname ,  prize2);
		 
		 int quantity = 3;
		 Fooditem.buyburger( quantity);
		 
		
		 String menus = "pizza";
		 Double amount2= 350.0;
		 int quantity2= 1;
		 Fooditem.menu(menus,amount2,quantity2);
		 
		 double prize = 450.0;
		 Fooditem.buyfood(prize);
		 
		 
		 String expirydate= "12March";
		 String manufacturedate="1feb"; 
		 boolean expired = false;
		 Fooditem.expireDate(expirydate,manufacturedate, expired);
		 
		 String dishname="Dosa";
		 int platecount = 3;
		  Fooditem.serve(dishname, platecount );
		  
		  System.out.println("-------------------------");
		  String name3 = "vijayavani";
		   Paper.fold(name3);
			
			int fontsize =5;
             Paper.write( fontsize);
			 
			 boolean needtoprint = true;
		   Paper.print(needtoprint);
		   
		   String paperType="A4";
		   double amount4 = 30.0;
		   Paper.recycle(paperType,  amount4);
		   
		   String papername="udayavani";
		   int prize3 = 3;
		   Paper.sell(papername, prize3 );
		   
		   String bookTitle="rv";
		   int pages=30;
		   boolean hardcover=true;
		   Paper.bind(bookTitle,pages, hardcover);
		   
		   String paperType2 = "a5";
		   String color= "black";
		   boolean waterproof =true;
		   Paper.color(paperType2, color, waterproof);
		   
		   System.out.println("-----------------------------");
		 
			String brand1 = "kingfisher";
			Beer.pour(brand1);
			
			boolean isCarbonated =true;
			 Beer.open(isCarbonated);
			 
			 String glassType = "Americanpint";
			 Beer.serve(glassType);
			 
			 String beerType= "wheatbeer";
			 String otherDrink = "juice";
			 Beer.mix(beerType,otherDrink);
			 
			 String brand2 = " Haywards";
			 int rating = 5;
			 Beer.rateTaste(brand2,rating);
			 
			 String brand3 = "knockout";
			 int temperature = 38;
			 boolean upright =false;
			 Beer.store( brand3, temperature, upright);
			 
			 
			 String brand4 ="Carsberg"; 
			 int sips=3;
			 boolean enjoy = true;
			 Beer.drink(brand4,sips,enjoy);
		
			 System.out.println("----------------------------");
			 
			 String colorpen ="green";
			 WhiteBoard.write( colorpen);
			 
			  String erasertype="duster";
			 WhiteBoard.erase(erasertype);
			 
			 String clothtype = "cotton";
			 WhiteBoard.clean( clothtype);
			 
			 String magnet ="yes";
			 int quantity5= 1;
			 WhiteBoard.attach(magnet, quantity5);
			 
			 int size4=3;
			 boolean colorful = false;
			 WhiteBoard.draw( size4,colorful);
			 
			 
			 String wallType="white";
			 int height=3;
			  boolean permanent =true;
			 WhiteBoard.mount(wallType,height,  permanent);
			 
			 String topic="eng";
			 String fontStyle="bxcjk";
			 boolean readable =true;
			 WhiteBoard.displayContent(topic,fontStyle,readable);
		 
	}
}