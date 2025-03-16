class Source{
	
	static int names(String source){
		if(source =="Amazon"){
			return 50;
		}
		else if(source == "eBay"){
			return 60;
		}
		else if(source == "Flipkart"){
			return 40;
		}
		else if(source == "Walmart"){
			return 60;
		}
		else if(source == "BestBuy"){
			return 50;
		}
		else if(source == "Paytm"){
			return 30;
		}
		else if(source == "shopsee"){
			return 60;
		}
		else if(source == "zepto"){
			return 40;
		}
		else if(source == "blinkit"){
			return 60;
		}
		else if(source == "swigi"){
			return 50;
		}
		else if(source == "zomato"){
			return 30;
		}
		return 00;
	}
}