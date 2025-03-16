class WaterBallRunner {
    public static void main(String[] args) {
        WaterBall waterBall1 = new WaterBall();

        int diameter = 5;
        WaterBall waterBall2 = new WaterBall(diameter);
        System.out.println("The diameter of WaterBall is " + waterBall2.diameter);

        int diameter2 = 5;
        int weight2 = 50;
        WaterBall waterBall3 = new WaterBall(diameter2, weight2);
        System.out.println("The diameter of WaterBall is " + waterBall3.diameter);
        System.out.println("The weight of WaterBall is " + waterBall3.weight);

        int diameter3 = 5;
        int weight3 = 50;
        String material3 = "Rubber";
        WaterBall waterBall4 = new WaterBall(diameter3, weight3, material3);
        System.out.println("The material of WaterBall is " + waterBall4.material);

        int diameter4 = 5;
        int weight4 = 50;
        String material4 = "Rubber";
        String color4 = "Blue";
        WaterBall waterBall5 = new WaterBall(diameter4, weight4, material4, color4);
        System.out.println("The color of WaterBall is " + waterBall5.color);

        int diameter5 = 5;
        int weight5 = 50;
        String material5 = "Rubber";
        String color5 = "Blue";
        int waterCapacity5 = 100;
        WaterBall waterBall6 = new WaterBall(diameter5, weight5, material5, color5, waterCapacity5);
        System.out.println("The water capacity of WaterBall is " + waterBall6.waterCapacity);

        int diameter6 = 5;
        int weight6 = 50;
        String material6 = "Rubber";
        String color6 = "Blue";
        int waterCapacity6 = 100;
        int durability6 = 10;
        WaterBall waterBall7 = new WaterBall(diameter6, weight6, material6, color6, waterCapacity6, durability6);
        System.out.println("The durability of WaterBall is " + waterBall7.durability);
    }
}
