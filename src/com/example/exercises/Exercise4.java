package com.example.exercises;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import com.example.dao.CityDao;
import com.example.dao.CountryDao;
import com.example.dao.InMemoryWorldDao;
import com.example.domain.City;
import com.example.domain.Country;

/**
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 */
public class Exercise4 {
    private static final CountryDao countryDao = InMemoryWorldDao.getInstance();
    private static final CityDao cityDao = InMemoryWorldDao.getInstance();

    public static void main(String[] args) {

        var countries = countryDao.findAllCountries();

        // Find the highest populated capital city
        var highPopulatedCapitalCity =
                getHighPopulatedCapitalCity(countries);
        highPopulatedCapitalCity.ifPresent(System.out::println);
    }

    private static Optional<City> getHighPopulatedCapitalCity(List<Country> countries) {
        throw new UnsupportedOperationException();
    }
}
