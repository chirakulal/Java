package com.xworkz.collectiondto.dto;

    public class BucketDTO {
        private String brand;
        private String material;
        private int capacityInLiters;
        private String color;
        private boolean hasHandle;
        private double price;
        private String usageType;

        @Override
        public String toString() {
            return "BucketDTO{" +
                    "brand='" + brand + '\'' +
                    ", material='" + material + '\'' +
                    ", capacityInLiters=" + capacityInLiters +
                    ", color='" + color + '\'' +
                    ", hasHandle=" + hasHandle +
                    ", price=" + price +
                    ", usageType='" + usageType + '\'' +
                    '}';
        }

        public BucketDTO() {
        }

        public BucketDTO(String brand, String material, int capacityInLiters, String color, boolean hasHandle, double price, String usageType) {
            this.brand = brand;
            this.material = material;
            this.capacityInLiters = capacityInLiters;
            this.color = color;
            this.hasHandle = hasHandle;
            this.price = price;
            this.usageType = usageType;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public int getCapacityInLiters() {
            return capacityInLiters;
        }

        public void setCapacityInLiters(int capacityInLiters) {
            this.capacityInLiters = capacityInLiters;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public boolean isHasHandle() {
            return hasHandle;
        }

        public void setHasHandle(boolean hasHandle) {
            this.hasHandle = hasHandle;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getUsageType() {
            return usageType;
        }

        public void setUsageType(String usageType) {
            this.usageType = usageType;
        }
    }


