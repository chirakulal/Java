package co.xworkz.country.repository;

import co.xworkz.country.dto.CountryDto;

import java.util.Collection;

public interface CommonRepository {

     Collection<CountryDto> findByAll();
}
