package com.ace.moviecatalogservice.Controllers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ace.moviecatalogservice.Model.CatalogItem;
import com.ace.moviecatalogservice.Model.MovieInfoBean;
import com.ace.moviecatalogservice.Model.MovieRatingResponceBean;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogRestController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable String userId){
		
		
		
		MovieRatingResponceBean movieRatings =  restTemplate.getForObject("http://ratings-data-service/ratings-data/user/1", MovieRatingResponceBean.class);
		
		return movieRatings.getMovieRatingBeanList().stream().map(rating ->{
			
			MovieInfoBean movie = restTemplate.getForObject("http://movie-info-service/movie-info/"+rating.getMovieId(), MovieInfoBean.class);
			return new CatalogItem(movie.getMovieName(), "Action Movie", rating.getRating());
		}).collect(Collectors.toList());
		
		//return Arrays.asList(new CatalogItem(movie.getMovieName(), "Action Movie", "5"));
	}

}
