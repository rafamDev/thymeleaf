package com.thymeleaf.hw.model;

public class Product {

	private String name;
	private String description;
	private Float price;
	private Integer numberVotes;
	private Float satisfactionPercentage;
	
	public Product(String name, String description, Float price, Integer numberVotes, Float satisfactionPercentage) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.numberVotes = numberVotes;
		this.satisfactionPercentage = satisfactionPercentage;
	}
	
	public Product() {}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Integer getNumberVotes() {
		return numberVotes;
	}
	public void setNumberVotes(Integer numberVotes) {
		this.numberVotes = numberVotes;
	}
	public Float getSatisfactionPercentage() {
		return satisfactionPercentage;
	}
	public void setSatisfactionPercentage(Float satisfactionPercentage) {
		this.satisfactionPercentage = satisfactionPercentage;
	}
	
	
}
