package com.website.galleryservice.entities;

import java.util.List;

public class Gallery {
	private Integer id;
	private List<Object> images;
	
	public Gallery(){}
	
	public Gallery(int galleryId){}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Object> getImages() {
		return images;
	}

	public void setImages(List<Object> images) {
		this.images = images;
	}
	
	
}
