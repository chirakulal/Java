package com.xworkz.list.runner;

import com.xworkz.list.dto.LaptopDTO;

import java.util.*;

public class LaptopRunner {

    public static void main(String[] args) {
        List<LaptopDTO> laptops = new ArrayList<>();
        laptops.add(new LaptopDTO("Dell", "XPS", 16, 512, "Intel i7", 120000.0, true, 13.3, "Silver", "Windows"));
        laptops.add(new LaptopDTO("HP", "Pavilion", 8, 256, "Intel i5", 60000.0, false, 15.6, "Black", "Windows"));
        laptops.add(new LaptopDTO("Apple", "MacBook Air", 8, 512, "M1", 100000.0, true, 13.6, "Gray", "macOS"));
        laptops.add(new LaptopDTO("Lenovo", "ThinkPad", 16, 1024, "Intel i9", 140000.0, false, 14.0, "Black", "Linux"));
        laptops.add(new LaptopDTO("Asus", "ROG", 32, 2048, "AMD Ryzen 9", 180000.0, false, 17.3, "Red", "Windows"));
        laptops.add(new LaptopDTO("Acer", "Swift", 16, 512, "Intel i7", 85000.0, true, 14.0, "Blue", "Windows"));
        laptops.add(new LaptopDTO("MSI", "GF63", 16, 512, "Intel i7", 90000.0, false, 15.6, "Black", "Windows"));
        laptops.add(new LaptopDTO("Samsung", "Galaxy Book", 8, 256, "Intel i5", 70000.0, true, 13.3, "Silver", "Windows"));
        laptops.add(new LaptopDTO("Realme", "Book Slim", 8, 512, "Intel i5", 45000.0, true, 14.0, "Blue", "Windows"));
        laptops.add(new LaptopDTO("Xiaomi", "Mi Notebook", 8, 256, "Intel i3", 40000.0, false, 15.6, "Gray", "Windows"));

        ListIterator<LaptopDTO> listIterator = laptops.listIterator();

        while (listIterator.hasNext()){
            LaptopDTO laptopDTO = listIterator.next();
            System.out.println(laptopDTO);
            if(laptopDTO.getBrand().equals("Realme")){
                LaptopDTO newLaptop = new LaptopDTO("Honor", "MagicBook", 16, 512, "Intel i5", 55000.0, true, 14.0, "Silver", "Windows");
                listIterator.add(newLaptop);
                System.out.println("Added after Realme: " + newLaptop);
            }
            }
        }


    }

