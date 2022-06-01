package com.ace.ratingsdataservice.Model;

public class MovieRatingBean {
	
	private String movieId;
	private String rating;
	
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public MovieRatingBean(String movieId, String rating) {
		super();
		this.movieId = movieId;
		this.rating = rating;
	}
	

}
