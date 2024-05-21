package com.example.exercises;

import java.util.Collection;
import java.util.List;

import com.example.domain.Genre;
import com.example.domain.Movie;
import com.example.service.InMemoryMovieService;
import com.example.service.MovieService;

/**
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 */
public class Exercise7 {
    private static final MovieService movieService = InMemoryMovieService.getInstance();

    public static void main(String[] args) {
        var movies = movieService.findAllMovies();
        // Find the list of movies having the genres "Drama" and "Comedy" only
        var listOfGenreNames = List.of("Drama", "Comedy");
        var listOfGenres = listOfGenreNames.stream().map(movieService::findGenreByName).toList();
        var moviesInDramaAndComedyOnly =
                getMoviesInDramaAndComedyOnly(movies, listOfGenres);
        moviesInDramaAndComedyOnly.forEach(movie -> System.out.printf("%s %s\n", movie, movie.getGenres()));
    }

    private static List<Movie> getMoviesInDramaAndComedyOnly(Collection<Movie> movies, List<Genre> listOfGenres) {
        throw new UnsupportedOperationException();
    }

}
