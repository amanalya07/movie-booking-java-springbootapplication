package com.example.util.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.util.Model.Movie;
import com.example.util.Repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	MovieRepository movieRepo;

	@Override
	public ResponseEntity<?> addMovie(Movie movie) {
		// TODO Auto-generated method stub
		movie.setTickets(new ArrayList());
		movie.setBookedSeats(new HashSet<String>());
		return new ResponseEntity<>(movieRepo.save(movie), HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<List<Movie>> getAllMovies() {
		// TODO Auto-generated method stub
		return new ResponseEntity<>(movieRepo.findAll(), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> searchByMovieId(Long movieId) {
		// TODO Auto-generated method stub
		Optional<Movie> movie = movieRepo.findByMovieId(movieId);
		if (movie.isPresent()) {
			return new ResponseEntity<>(movie.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>("movie not found", HttpStatus.NOT_FOUND);
		}
	}

}
