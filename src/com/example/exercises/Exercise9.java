package com.example.exercises;

import static java.lang.System.out;
import static java.util.Comparator.comparingDouble;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import com.example.dao.InMemoryWorldDao;
import com.example.dao.WorldDao;
import com.example.domain.Country;

/**
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 */
public class Exercise9 {
    private static final WorldDao worldDao = InMemoryWorldDao.getInstance();

    public static void main(String[] args) {
        // Sort the countries by their population densities in descending order ignoring
        // zero population countries
        var countries = worldDao.findAllCountries();
        var countriesSortedByPopulationDensityDescOrder =
                getCountriesSortedByPopulationDensityDescOrder(countries);
        countriesSortedByPopulationDensityDescOrder.forEach(out::println);
    }

    private static List<Country> getCountriesSortedByPopulationDensityDescOrder(List<Country> countries) {
        throw new UnsupportedOperationException();
    }
}
