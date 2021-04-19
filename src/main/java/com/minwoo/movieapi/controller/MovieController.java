package com.minwoo.movieapi.controller;

import com.minwoo.movieapi.dto.MovieInfo;
import com.minwoo.movieapi.service.MovieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    //Create
    @PostMapping("/movies")
    public void insertMovie(@RequestBody MovieInfo movieInfo) {
        movieService.insertMovie(movieInfo);
    }

    // ReadAll
    @GetMapping("/movies")
    public List<MovieInfo> getMovies() {
        return movieService.getMovies();
    }

    // ReadOne
    @GetMapping("/movies/{movieId}")
    public MovieInfo getMovie(@PathVariable("movieId") int movieId) {
        return movieService.getMovie(movieId);
    }

    // Update
    @PatchMapping("/movies/{movieId}")
    public void updateMovie(@PathVariable("movieId") int movieId, @RequestBody MovieInfo movieInfo) {
        movieInfo.setMovieId(movieId);
        movieService.updateMovie(movieInfo);
    }

    // Delete
    @DeleteMapping("/movies/{movieId}")
    public void deleteMovie(@PathVariable("movieId") int movieId) {
        movieService.deleteMovie(movieId);
    }

}
