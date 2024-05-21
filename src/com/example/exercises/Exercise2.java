package com.example.exercises;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.example.dao.CountryDao;
import com.example.dao.InMemoryWorldDao;
import com.example.domain.Country;

/**
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 */
public class Exercise2 {
    private static final CountryDao countryDao = InMemoryWorldDao.getInstance();

    public static void main(String[] args) {

        var countries = countryDao.findAllCountries();

        // Find the most populated city of each continent
        var highPopulatedCityOfEachContinent = getHighPopulatedCityOfEachContinent(countries);
        highPopulatedCityOfEachContinent.forEach(ContinentCityPair::printEntry);
    }

    private static Map<String, Optional<ContinentCityPair>> getHighPopulatedCityOfEachContinent(List<Country> countries) {
        throw new UnsupportedOperationException();
    }

}