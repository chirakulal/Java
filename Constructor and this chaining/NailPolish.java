class NailPolish {
    String brand;
    String color;
    int volume;
    String finish;
    boolean isLongLasting;
    double price;

    
    public NailPolish() {
        System.out.println("No-arg constructor is running");
    }

    public NailPolish(String brand) {
        this.brand = brand;
        System.out.println("One-arg constructor is running");
    }

    public NailPolish(String brand, String color) {
        this(brand);
        this.color = color;
        System.out.println("Two-arg constructor is running");
    }

    public NailPolish(String brand, String color, int volume) {
        this(brand, color);
        this.volume = volume;
        System.out.println("Three-arg constructor is running");
    }

    public NailPolish(String brand, String color, int volume, String finish) {
        this(brand, color, volume);
        this.finish = finish;
        System.out.println("Four-arg constructor is running");
    }

    public NailPolish(String brand, String color, int volume, String finish, boolean isLongLasting) {
        this(brand, color, volume, finish);
        this.isLongLasting = isLongLasting;
        System.out.println("Five-arg constructor is running");
    }

    public NailPolish(String brand, String color, int volume, String finish, boolean isLongLasting, double price) {
        this(brand, color, volume, finish, isLongLasting);
        this.price = price;
        System.out.println("Six-arg constructor is running");
    }
}
