class Gun {
    String model;
    int caliber;
    int magazineCapacity;
    String material;
    String color;
    int weight;

    
    public Gun() {
        System.out.println("No-arg constructor is running");
    }

    public Gun(String model) {
        this.model = model;
        System.out.println("One-arg constructor is running");
    }

    public Gun(String model, int caliber) {
        this(model);
        this.caliber = caliber;
        System.out.println("Two-arg constructor is running");
    }

    public Gun(String model, int caliber, int magazineCapacity) {
        this(model, caliber);
        this.magazineCapacity = magazineCapacity;
        System.out.println("Three-arg constructor is running");
    }

    public Gun(String model, int caliber, int magazineCapacity, String material) {
        this(model, caliber, magazineCapacity);
        this.material = material;
        System.out.println("Four-arg constructor is running");
    }

    public Gun(String model, int caliber, int magazineCapacity, String material, String color) {
        this(model, caliber, magazineCapacity, material);
        this.color = color;
        System.out.println("Five-arg constructor is running");
    }

    public Gun(String model, int caliber, int magazineCapacity, String material, String color, int weight) {
        this(model, caliber, magazineCapacity, material, color);
        this.weight = weight;
        System.out.println("Six-arg constructor is running");
    }
}
