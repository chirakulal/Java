class NailPolishRunner {
    public static void main(String[] args) {
        NailPolish np1 = new NailPolish();

        String brand = "Lakme";
        NailPolish np2 = new NailPolish(brand);
        System.out.println("The brand of NailPolish is " + np2.brand);

        String brand2 = "Lakme";
        String color2 = "Red";
        NailPolish np3 = new NailPolish(brand2, color2);
		System.out.println("The brand of NailPolish is " + np3.brand);
        System.out.println("The color of NailPolish is " + np3.color);

        String brand3 = "Lakme";
        String color3 = "Red";
        int volume3 = 10;
        NailPolish np4 = new NailPolish(brand3, color3, volume3);
		System.out.println("The brand of NailPolish is " + np4.brand);
        System.out.println("The color of NailPolish is " + np4.color);
        System.out.println("The volume of NailPolish is " + np4.volume);

        String brand4 = "Lakme";
        String color4 = "Red";
        int volume4 = 10;
        String finish4 = "Glossy";
        NailPolish np5 = new NailPolish(brand4, color4, volume4, finish4);
		System.out.println("The brand of NailPolish is " + np5.brand);
        System.out.println("The color of NailPolish is " + np5.color);
        System.out.println("The volume of NailPolish is " + np5.volume);
        System.out.println("The finish of NailPolish is " + np5.finish);

        String brand5 = "Lakme";
        String color5 = "Red";
        int volume5 = 10;
        String finish5 = "Glossy";
        boolean isLongLasting5 = true;
        NailPolish np6 = new NailPolish(brand5, color5, volume5, finish5, isLongLasting5);
		System.out.println("The brand of NailPolish is " + np6.brand);
        System.out.println("The color of NailPolish is " + np6.color);
        System.out.println("The volume of NailPolish is " + np6.volume);
        System.out.println("The finish of NailPolish is " + np6.finish);
        System.out.println("Is NailPolish long-lasting? " + np6.isLongLasting);

        String brand6 = "Lakme";
        String color6 = "Red";
        int volume6 = 10;
        String finish6 = "Glossy";
        boolean isLongLasting6 = true;
        double price6 = 150.0;
        NailPolish np7 = new NailPolish(brand6, color6, volume6, finish6, isLongLasting6, price6);
		System.out.println("The brand of NailPolish is " + np7.brand);
        System.out.println("The color of NailPolish is " + np7.color);
        System.out.println("The volume of NailPolish is " + np7.volume);
        System.out.println("The finish of NailPolish is " + np7.finish);
        System.out.println("Is NailPolish long-lasting? " + np7.isLongLasting);
        System.out.println("The price of NailPolish is " + np7.price);
    }
}
