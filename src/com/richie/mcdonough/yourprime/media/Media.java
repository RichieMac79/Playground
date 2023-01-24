package com.richie.mcdonough.yourprime.media;

import com.richie.mcdonough.yourprime.media.genre.Genre;

public class Media {
	protected String title = "";
	protected int year = 0;
	protected int rating = 0;
	protected double price = 0.0;
	protected Genre genre;
	
	public double getPrice() {
		this.price = genre.setPrice(rating);
		return price;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getRating() {
		return rating;
	}
}
