package com.ace.moviecatalogservice.Model;

public class MovieInfoBean {
	
	private String movieId;
	private String movieName;
	
	public MovieInfoBean() {
		super();
	}
	public MovieInfoBean(String movieId, String movieName) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	
	
	

}
