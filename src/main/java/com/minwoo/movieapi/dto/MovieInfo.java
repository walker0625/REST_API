package com.minwoo.movieapi.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.ibatis.type.Alias;

import java.util.Date;

// myBatisConfig.xml에서 package는 Alias 되어있음
@Alias("MovieInfo")
public class MovieInfo {
    private int movieId;
    private String movieName;
    private String movieGenre;
    private int movieRunningTime;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date movieOpeningDate;
    private Double movieRating;
    private String movieActors;
    private String[] movieActorsArray;

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public int getMovieRunningTime() {
        return movieRunningTime;
    }

    public void setMovieRunningTime(int movieRunningTime) {
        this.movieRunningTime = movieRunningTime;
    }

    public Date getMovieOpeningDate() {
        return movieOpeningDate;
    }

    public void setMovieOpeningDate(Date movieOpeningDate) {
        this.movieOpeningDate = movieOpeningDate;
    }

    public Double getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(Double movieRating) {
        this.movieRating = movieRating;
    }

    public String getMovieActors() {
        return movieActors;
    }

    public void setMovieActors(String movieActors) {
        this.movieActors = movieActors;
    }

    public String[] getMovieActorsArray() {
        return movieActorsArray;
    }

    public void setMovieActorsArray(String[] movieActorsArray) {
        this.movieActorsArray = movieActorsArray;
    }

}