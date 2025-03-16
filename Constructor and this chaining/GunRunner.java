class GunRunner {
    public static void main(String[] args) {
        Gun gun1 = new Gun();

        String model = "Glock 19";
        Gun gun2 = new Gun(model);
        System.out.println("The model of gun is " + gun2.model);

        String model2 = "Glock 19";
        int caliber2 = 9;
        Gun gun3 = new Gun(model2, caliber2);
		System.out.println("The model of gun is " + gun3.model);
        System.out.println("The caliber of gun is " + gun3.caliber);

        String model3 = "Glock 19";
        int caliber3 = 9;
        int magazineCapacity3 = 15;
        Gun gun4 = new Gun(model3, caliber3, magazineCapacity3);
		System.out.println("The model of gun is " + gun4.model);
        System.out.println("The caliber of gun is " + gun4.caliber);
        System.out.println("The magazine capacity of gun is " + gun4.magazineCapacity);

        String model4 = "Glock 19";
        int caliber4 = 9;
        int magazineCapacity4 = 15;
        String material4 = "Polymer";
        Gun gun5 = new Gun(model4, caliber4, magazineCapacity4, material4);
		System.out.println("The model of gun is " + gun5.model);
        System.out.println("The caliber of gun is " + gun5.caliber);
        System.out.println("The magazine capacity of gun is " + gun5.magazineCapacity);
        System.out.println("The material of gun is " + gun5.material);

        String model5 = "Glock 19";
        int caliber5 = 9;
        int magazineCapacity5 = 15;
        String material5 = "Polymer";
        String color5 = "Black";
        Gun gun6 = new Gun(model5, caliber5, magazineCapacity5, material5, color5);
		System.out.println("The model of gun is " + gun6.model);
        System.out.println("The caliber of gun is " + gun6.caliber);
        System.out.println("The magazine capacity of gun is " + gun6.magazineCapacity);
        System.out.println("The material of gun is " + gun6.material);
        System.out.println("The color of gun is " + gun6.color);

        String model6 = "Glock 19";
        int caliber6 = 9;
        int magazineCapacity6 = 15;
        String material6 = "Polymer";
        String color6 = "Black";
        int weight6 = 700;
        Gun gun7 = new Gun(model6, caliber6, magazineCapacity6, material6, color6, weight6);
		System.out.println("The model of gun is " + gun7.model);
        System.out.println("The caliber of gun is " + gun7.caliber);
        System.out.println("The magazine capacity of gun is " + gun7.magazineCapacity);
        System.out.println("The material of gun is " + gun7.material);
        System.out.println("The color of gun is " + gun7.color);
        System.out.println("The weight of gun is " + gun7.weight);
    }
}
