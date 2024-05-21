package com.example.exercises;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.example.domain.Movie;
import com.example.service.InMemoryMovieService;
import com.example.service.MovieService;

/**
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 */
public class Exercise8 {
    private static final MovieService movieService = InMemoryMovieService.getInstance();

    public static void main(String[] args) {
        var movies = movieService.findAllMovies();
        // Group the movies by the year and list them
        var moviesByYear = getMoviesByYear(movies);
        moviesByYear.forEach((year, m) -> System.out.printf("%d: %s\n", year, m));
    }

    private static Map<Integer, List<Movie>> getMoviesByYear(Collection<Movie> movies) {
        throw new UnsupportedOperationException();
    }
}
