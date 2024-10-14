package com.example.util.Service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.util.Model.Movie;

public interface MovieService {
	
	public ResponseEntity<?> addMovie(Movie movie);
	
	public ResponseEntity<List<Movie>> getAllMovies();
	
	public ResponseEntity<?> searchByMovieId(Long movieId);

}
