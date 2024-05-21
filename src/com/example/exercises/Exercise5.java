package com.example.exercises;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.example.dao.CityDao;
import com.example.dao.CountryDao;
import com.example.dao.InMemoryWorldDao;
import com.example.domain.City;
import com.example.domain.Country;

/**
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 */
public class Exercise5 {
    private static final CountryDao countryDao = InMemoryWorldDao.getInstance();
    private static final CityDao cityDao = InMemoryWorldDao.getInstance();

    public static void main(String[] args) {
        var countries = countryDao.findAllCountries();
        // Find the highest populated capital city of each continent
        Function<ContinentCityPair, City> extractCity = ContinentCityPair::city;
        var highPopulatedCapitalCityOfEachContinent =
                getHighPopulatedCapitalCityOfEachContinent(countries, extractCity);
        highPopulatedCapitalCityOfEachContinent.forEach((continent, pair) -> System.out.printf("%s: %s\n", continent, pair.get().city()));
    }

    private static Map<String, Optional<ContinentCityPair>> getHighPopulatedCapitalCityOfEachContinent(List<Country> countries, Function<ContinentCityPair, City> extractCity) {
        throw new UnsupportedOperationException();
    }

}