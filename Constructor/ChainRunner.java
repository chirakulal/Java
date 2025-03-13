class ChainRunner{

	public static void main(String[] args){
		
		String material = "Gold";
		int length = 50;
		String type = "Curb";
		
		Chain chain1 = new Chain(material,length,type);
		
		System.out.println("material is "+chain1.material);
		System.out.println("length is "+chain1.length);
		System.out.println("Type is "+chain1.type);
		
				
		String material2 = "silver";
		int length2 = 45;
		String type2 = "rope";
		
		Chain chain2 = new Chain(material2,length2,type2);
		
		System.out.println("material is "+chain2.material);
		System.out.println("length is "+chain2.length);
		System.out.println("Type is "+chain2.type);
		
				
		String material3 = "platinum";
		int length3 = 50;
		String type3 = "figaro";
		
		Chain chain3 = new Chain(material3,length3,type3);
		
		System.out.println("material is "+chain3.material);
		System.out.println("length is "+chain3.length);
		System.out.println("Type is "+chain3.type);
		
			
				
		String material4 = "copper";
		int length4 = 50;
		String type4 = "Cable";
		
		Chain chain4 = new Chain(material4,length4,type4);
		
		System.out.println("material is "+chain4.material);
		System.out.println("length is "+chain4.length);
		System.out.println("Type is "+chain4.type);
		
		
		String material5 = "brass";
		int length5 = 47;
		String type5 = "beaded";
		
		Chain chain5 = new Chain(material,length,type);
		
		System.out.println("material is "+chain5.material);
		System.out.println("length is "+chain5.length);
		System.out.println("Type is "+chain5.type);
		
		
	}
}