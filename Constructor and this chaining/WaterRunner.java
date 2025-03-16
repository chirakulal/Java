class WaterRunner {
    public static void main(String[] args) {
        Water water1 = new Water();

        String source = "River";
        Water water2 = new Water(source);
        System.out.println("The source of water is " + water2.source);

        String source2 = "River";
        String type2 = "Freshwater";
        Water water3 = new Water(source2, type2);
		System.out.println("The source of water is " + water3.source);
        System.out.println("The type of water is " + water3.type);

        String source3 = "River";
        String type3 = "Freshwater";
        double pH3 = 7.0;
        Water water4 = new Water(source3, type3, pH3);
		System.out.println("The source of water is " + water4.source);
        System.out.println("The type of water is " + water4.type);
        System.out.println("The pH of water is " + water4.pH);

        String source4 = "River";
        String type4 = "Freshwater";
        double pH4 = 7.0;
        boolean isDrinkable4 = true;
        Water water5 = new Water(source4, type4, pH4, isDrinkable4);
		System.out.println("The source of water is " + water5.source);
        System.out.println("The type of water is " + water5.type);
        System.out.println("The pH of water is " + water5.pH);
        System.out.println("Is water drinkable? " + water5.isDrinkable);

        String source5 = "River";
        String type5 = "Freshwater";
        double pH5 = 7.0;
        boolean isDrinkable5 = true;
        double temperature5 = 25.0;
        Water water6 = new Water(source5, type5, pH5, isDrinkable5, temperature5);
		System.out.println("The source of water is " + water6.source);
        System.out.println("The type of water is " + water6.type);
        System.out.println("The pH of water is " + water6.pH);
        System.out.println("Is water drinkable? " + water6.isDrinkable);
        System.out.println("The temperature of water is " + water6.temperature);

        String source6 = "River";
        String type6 = "Freshwater";
        double pH6 = 7.0;
        boolean isDrinkable6 = true;
        double temperature6 = 25.0;
        double quantity6 = 1.5;
        Water water7 = new Water(source6, type6, pH6, isDrinkable6, temperature6, quantity6);
		System.out.println("The source of water is " + water7.source);
        System.out.println("The type of water is " + water7.type);
        System.out.println("The pH of water is " + water7.pH);
        System.out.println("Is water drinkable? " + water7.isDrinkable);
        System.out.println("The temperature of water is " + water7.temperature);
        System.out.println("The quantity of water is " + water7.quantity);
    }
}
