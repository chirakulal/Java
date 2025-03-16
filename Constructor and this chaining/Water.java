class Water {
    String source;
    String type;
    double pH;
    boolean isDrinkable;
    double temperature;
    double quantity;

    
    public Water() {
        System.out.println("No-arg constructor is running");
    }

    public Water(String source) {
        this.source = source;
        System.out.println("One-arg constructor is running");
    }

    public Water(String source, String type) {
        this(source);
        this.type = type;
        System.out.println("Two-arg constructor is running");
    }

    public Water(String source, String type, double pH) {
        this(source, type);
        this.pH = pH;
        System.out.println("Three-arg constructor is running");
    }

    public Water(String source, String type, double pH, boolean isDrinkable) {
        this(source, type, pH);
        this.isDrinkable = isDrinkable;
        System.out.println("Four-arg constructor is running");
    }

    public Water(String source, String type, double pH, boolean isDrinkable, double temperature) {
        this(source, type, pH, isDrinkable);
        this.temperature = temperature;
        System.out.println("Five-arg constructor is running");
    }

    public Water(String source, String type, double pH, boolean isDrinkable, double temperature, double quantity) {
        this(source, type, pH, isDrinkable, temperature);
        this.quantity = quantity;
        System.out.println("Six-arg constructor is running");
    }
}
