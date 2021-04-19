package com.minwoo.movieapi.repository;

import com.minwoo.movieapi.dto.MovieInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//@Repository가 아니라 Mapper 어노테이션(MovieapiApplication의 MapperScan 필요 x)
@Mapper
public interface MovieRepository {
    void insertMovie(MovieInfo movieInfo);
    List<MovieInfo> getMovies();
    MovieInfo getMovie(int movieId);
    void updateMovie(MovieInfo movieInfo);
    void deleteMovie(int movieId);
}
