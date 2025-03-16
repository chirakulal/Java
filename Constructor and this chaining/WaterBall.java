class WaterBall {
    
    int diameter;
    int weight;
    String material;
    String color;
    int waterCapacity;
    int durability;

    
    public WaterBall() {
        System.out.println("No-arg constructor is running");
    }

   
    public WaterBall(int diameter) {
        this.diameter = diameter;
        System.out.println("One-arg constructor is running");
    }

   
    public WaterBall(int diameter, int weight) {
        this(diameter);
        this.weight = weight;
        System.out.println("Two-arg constructor is running");
    }

   
    public WaterBall(int diameter, int weight, String material) {
        this(diameter, weight);
        this.material = material;
        System.out.println("Three-arg constructor is running");
    }

  
    public WaterBall(int diameter, int weight, String material, String color) {
        this(diameter, weight, material);
        this.color = color;
        System.out.println("Four-arg constructor is running");
    }

   
     public WaterBall(int diameter, int weight, String material, String color, int waterCapacity) {
        this(diameter, weight, material, color);
        this.waterCapacity = waterCapacity;
        System.out.println("Five-arg constructor is running");
    }

    
    public WaterBall(int diameter, int weight, String material, String color, int waterCapacity, int durability) {
        this(diameter, weight, material, color, waterCapacity);
        this.durability = durability;
        System.out.println("Six-arg constructor is running");
    }
}