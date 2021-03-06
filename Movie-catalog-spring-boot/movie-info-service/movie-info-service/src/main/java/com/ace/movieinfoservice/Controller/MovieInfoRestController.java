package com.ace.movieinfoservice.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ace.movieinfoservice.Model.MovieInfoBean;

@RestController()
@RequestMapping("/movie-info")
public class MovieInfoRestController {
	
	@GetMapping("/{movieId}")
	public MovieInfoBean getMovieInfo(@PathVariable String movieId) {
		return new MovieInfoBean(movieId, "Expandables");
	}

}
