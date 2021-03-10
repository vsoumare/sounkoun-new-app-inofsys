package com.saraya.model;

import javax.validation.constraints.Size;

public class Game {
	private int id;
	private String name;
	private String genre;
	
	@Size(min=10, message="Enter at least 10 Characters please")
	private String description;
	private String price;
	
	public Game() {
		super();
	}
	public Game(int id, String name, String genre, String description, String price) {
		super();
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.description = description;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return String.format("Game [id=%s, name=%s, genre=%s, description=%s, price=%s]", id, name, genre, description,
				price);
	}
	
	
}
