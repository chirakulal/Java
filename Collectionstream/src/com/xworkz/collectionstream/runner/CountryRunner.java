package com.xworkz.collectionstream.runner;

import com.xworkz.collectionstream.repository.CountryRepository;
import com.xworkz.collectionstream.repository.CountryRepositoyImpl;


import java.util.Collection;
import java.util.Comparator;

public class CountryRunner {


    public static void main(String[] args) {

        CountryRepository countryRepository = new CountryRepositoyImpl();
       Collection<String> collection = countryRepository.findAll();

        System.out.println("name of all the 196 countries");
       collection.stream().forEach((name)-> System.out.println(name));

        System.out.println("-------------------------------------------------------------------");

        System.out.println("Countries starting with I");
        collection.stream().filter(c->c.startsWith("I")).forEach(e-> System.out.println(e));

        System.out.println("-------------------------------------------------------------------");
        System.out.println("Countries starting with G");
        collection.stream().filter(c->c.startsWith("G")).forEach(e-> System.out.println(e));

        System.out.println("-------------------------------------------------------------------");
        System.out.println("countries ending with A");
        collection.stream().filter(c->c.endsWith("a")).forEach(e-> System.out.println(e));

        System.out.println("-------------------------------------------------------------------");
        System.out.println("all countries by desc");
        collection.stream().sorted(Comparator.reverseOrder()).forEach(e-> System.out.println(e));

        System.out.println("-------------------------------------------------------------------");
        System.out.println("all countries by asc");
        collection.stream().sorted().forEach(e-> System.out.println(e));

        System.out.println("-------------------------------------------------------------------");
        System.out.println("Countries with more than 6 characters:");
        collection.stream().filter(c->c.length()>6).forEach(e-> System.out.println(e));

        System.out.println("-------------------------------------------------------------------");
        System.out.println("Countries with less than 4 characters:");
        collection.stream().filter(c->c.length()<4).forEach(e-> System.out.println(e));

        System.out.println("-------------------------------------------------------------------");
        System.out.println("all countries which contains 'O'");
        collection.stream().filter(c->c.toUpperCase().contains("O")).forEach(e-> System.out.println(e));

        System.out.println("-------------------------------------------------------------------");
        System.out.println(" Countries with character occurring more than once:");
        collection.stream().filter(c->c.length()>6).forEach(e-> System.out.println(e));

        System.out.println("\n10. Countries with character occurring more than once:");
        collection.stream()
                .filter(name -> {
                    String lower = name.toLowerCase();
                    for (int i = 0; i < lower.length(); i++) {
                        char ch = lower.charAt(i);
                        for (int j = i + 1; j < lower.length(); j++) {
                            if (ch == lower.charAt(j)) {
                                return true;
                            }
                        }
                    }
                    return false;
                })
                .forEach(e-> System.out.println(e));

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Reverse all country name");
        collection.stream().forEach(name -> {
            String reverse = "";
            for (int i = name.length() - 1; i >= 0; i--) {
                reverse += name.charAt(i);
            }
            System.out.println(reverse);
        });

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println(" find palindrome country");
        collection.stream().filter(name -> {
            String lower = name.toLowerCase();
            return new StringBuilder(lower).reverse().toString().equals(lower);
        })
                .forEach(System.out::println);

        System.out.println("-----------------------------------------------------------------------");
        System.out.println("\n13. Length of each country:");
        collection.stream().forEach(name -> System.out.println(name + ": " + name.length()));
    }

}
