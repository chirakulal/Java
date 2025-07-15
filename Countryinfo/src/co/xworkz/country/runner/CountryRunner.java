package co.xworkz.country.runner;

import co.xworkz.country.dto.CountryDto;
import co.xworkz.country.repository.CommonReposiotryImpl;
import co.xworkz.country.repository.CommonRepository;

import java.util.Collection;
import java.util.Optional;

public class CountryRunner {

    public static void main(String[] args) {
        CommonRepository commonRepository = new CommonReposiotryImpl();
       Collection<CountryDto> collection =commonRepository.findByAll();


        System.out.println(" Find all countries");
        collection.forEach((dto)-> System.out.println(dto));

        System.out.println("--------------------------------------------------------");
        System.out.println("Find all countries ending with 'a'");
        collection.stream().filter(dto->dto.getName().toLowerCase().endsWith("a")).forEach(dto-> System.out.println(dto));

        System.out.println("--------------------------------------------------------");
        System.out.println(" find all countries starting with 'R'");
        collection.stream()
                .filter(dto -> dto.getName().toUpperCase().startsWith("R"))
                .forEach(dto-> System.out.println(dto));


        System.out.println("--------------------------------------------------------");
        System.out.println("  Find country by pin code");
        collection.stream().filter(dto->2550 == dto.getPinCode()).forEach(dto-> System.out.println("Country Name : "+dto.getName()));

        System.out.println("--------------------------------------------------------");
        System.out.println("   Find a optional country by primeMinister");
      Optional<CountryDto> countryDto = collection.stream().filter(dto->"Pedro Sánchez".equalsIgnoreCase(dto.getPrimeMinister())).findFirst();
       if(countryDto.isPresent()){
           System.out.println("CountryName :"+countryDto.get().getName());
       }
        System.out.println("--------------------------------------------------------");
        System.out.println("Find all countries where mass between");
        collection.stream().filter(dto->dto.getMassInSqKms()>=10000000 && dto.getMassInSqKms()<=20000000).forEach(dto-> System.out.println("Country Name "+dto.getName()));

        System.out.println("--------------------------------------------------------");
        System.out.println("Find all country where primary lang is english");
        collection.stream().filter(dto->"english".equalsIgnoreCase(dto.getPrimaryLanguage())).forEach(dto-> System.out.println(dto.getName()));

        System.out.println("--------------------------------------------------------");
        System.out.println("Find optional by noOfStates > than");
        collection.stream().filter(dto->dto.getNoOfStates()>10).forEach(dto-> System.out.println(dto.getName()));
    }
}
