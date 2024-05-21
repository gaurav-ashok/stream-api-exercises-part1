package com.example.exercises;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;

import com.example.domain.Director;
import com.example.domain.Genre;
import com.example.domain.Movie;
import com.example.service.InMemoryMovieService;
import com.example.service.MovieService;

/**
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 */
public class Exercise3 {
    private static final MovieService movieService = InMemoryMovieService.getInstance();

    public static void main(String[] args) {

        var movies = movieService.findAllMovies();

        // Find the number of genres of each director's movies
        var directorGenreNumbers =
                getDirectorGenreNumbers(movies);
        directorGenreNumbers.forEach((director, genreCounts) -> {
            System.out.printf("%s\n", director.getName());
            genreCounts.forEach((genre, count) -> System.out.printf("\t%s: %s\n", genre.getName(), count));
        });

    }

    private static Map<Director, Map<Genre, Long>> getDirectorGenreNumbers(Collection<Movie> movies) {
        throw new UnsupportedOperationException();
    }
}