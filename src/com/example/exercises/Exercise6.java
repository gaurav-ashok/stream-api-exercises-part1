package com.example.exercises;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import com.example.dao.CountryDao;
import com.example.dao.InMemoryWorldDao;
import com.example.domain.Country;

/**
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 */
public class Exercise6 {
    private static final CountryDao countryDao = InMemoryWorldDao.getInstance();

    public static void main(String[] args) {
        // Sort the countries by number of their cities in descending order
        var countries = countryDao.findAllCountries();
        Function<CountryCityCountPair, Integer> countExtracter = CountryCityCountPair::count;
        var countriesWithCityCountInDescOrder =
                getCountriesWithCityCountInDescOrder(countries, countExtracter);
        countriesWithCityCountInDescOrder.forEach(System.out::println);
    }

    private static List<CountryCityCountPair> getCountriesWithCityCountInDescOrder(List<Country> countries, Function<CountryCityCountPair, Integer> countExtracter) {
        throw new UnsupportedOperationException();
    }

}
