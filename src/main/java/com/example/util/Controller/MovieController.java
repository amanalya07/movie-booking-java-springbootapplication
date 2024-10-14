package com.example.util.Controller;

import java.util.List;

import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.util.Model.Movie;
import com.example.util.Service.MovieService;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/api/moviebooking")
public class MovieController {

	@Autowired
	private MovieService movieService;

	@PostMapping("/addmovie")
	@Operation(summary = "add the movie in the database")
	public ResponseEntity<?> addMovies(@RequestBody Movie movie) {
	movieService.addMovie(movie);
		String message = "movie added successfully..!";
		return new ResponseEntity<String>(message, HttpStatus.OK);
	}

	@GetMapping("/getAllMovies")
	@Operation(summary = "Get All the movies from the database")
	public ResponseEntity<List<Movie>> getAllMovies() {
		return movieService.getAllMovies();
	}

	@GetMapping("/movies/search/{movieId}")
	@Operation(summary="Get the movie with the id")
	public ResponseEntity<?> searchMovieById(@PathVariable(value = "movieId") Long id){
		
		return new ResponseEntity<>(movieService.searchByMovieId(id), HttpStatus.OK);
	}
}
