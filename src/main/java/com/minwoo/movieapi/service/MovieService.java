package com.minwoo.movieapi.service;

import com.minwoo.movieapi.dto.MovieInfo;
import com.minwoo.movieapi.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public void insertMovie(MovieInfo movieInfo) {
        movieRepository.insertMovie(movieInfo);
    }

    public List<MovieInfo> getMovies() {
        return splitActorsStringList(movieRepository.getMovies());
    }

    public MovieInfo getMovie(int movieId) {
        return splitActorsString(movieRepository.getMovie(movieId));
    }

    public void updateMovie(MovieInfo movieInfo) {
        movieRepository.updateMovie(movieInfo);
    }

    public void deleteMovie(int movieId) {
        movieRepository.deleteMovie(movieId);
    }

    private List<MovieInfo> splitActorsStringList(List<MovieInfo> moviesInfoList) {
        for(MovieInfo movieInfo : moviesInfoList) {
            movieInfo.setMovieActorsArray(movieInfo.getMovieActors().split(","));
        }

        return moviesInfoList;
    }

    private MovieInfo splitActorsString(MovieInfo movieInfo) {
        movieInfo.setMovieActorsArray(movieInfo.getMovieActors().split(","));
        return movieInfo;
    }

}