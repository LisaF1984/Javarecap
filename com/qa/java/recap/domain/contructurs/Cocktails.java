package com.qa.java.recap.domain.contructurs;

public class Cocktails {
	
	private String name;
	private String ingredients;
	private int volume;
	private int price;
	private boolean twoForOne;
	
	
	public Cocktails(String name, String ingredients, int volume, int price, boolean twoForOne) {
		super();
		this.name = name;
		this.ingredients = ingredients;
		this.volume = volume;
		this.price = price;
		this.twoForOne = twoForOne;

	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getIngredients() {
		return ingredients;
	}


	public void setIngredients(String ingredients) {
		
		if(ingredients == "campari") {
			System.out.println("this is disgusting and banned!");}
		
		else {
			this.ingredients = ingredients;}
	
	}

	public int getVolume() {
		return volume;
	}


	public void setVolume(int volume) {
		
		if(volume >= 60) {
			System.out.println("This is out of licence laws");}
		else {
			this.volume = volume; }
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public boolean isTwoForOne() {
		return twoForOne;
	}


	public void setTwoForOne(boolean twoForOne) {
		this.twoForOne = twoForOne;
	}
	}
	
	
	


