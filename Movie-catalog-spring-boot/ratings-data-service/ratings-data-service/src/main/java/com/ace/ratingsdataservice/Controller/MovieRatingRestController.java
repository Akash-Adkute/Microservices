package com.ace.ratingsdataservice.Controller;

import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ace.ratingsdataservice.Model.MovieRatingBean;
import com.ace.ratingsdataservice.Model.MovieRatingResponceBean;

@RestController
@RequestMapping("/ratings-data")
public class MovieRatingRestController {
	
	@GetMapping("/{movieId}")
	public MovieRatingBean getMovieRating(@PathVariable String movieId) {
		return new MovieRatingBean(movieId, "4");
	}
	
	@GetMapping("user/{userId}")
	public MovieRatingResponceBean getMovieRatings(@PathVariable String userId) {
		MovieRatingResponceBean respBean = new MovieRatingResponceBean();
		respBean.setMovieRatingBeanList(Arrays.asList(
				new MovieRatingBean("101", "4"),
				new MovieRatingBean("102", "5")
				));
		
		return respBean;
	}

}
