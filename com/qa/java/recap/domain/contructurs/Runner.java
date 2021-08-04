package com.qa.java.recap.domain.contructurs;

public class Runner {
	
	public static void main(String[] args) {
		
		Cocktails longCocktail = new Cocktails("Long island ice tea", "Vodka, Tequila, Rum, Cola", 20, 8, false);
		System.out.println(longCocktail.getIngredients());
		
		Cocktails tomCocktail = new Cocktails("Tom Collins", "Gin, Lemon juice, Soda water, Syrup", 25, 7, true);
		System.out.println(tomCocktail.isTwoForOne());
		
		Cocktails aperolCocktail = new Cocktails("Aperol Spritz", " Aperol, Prosecco, Soda water", 15, 7, true);
		 System.out.println(aperolCocktail.getName());
		 
	
		 
		 longCocktail.setIngredients("campari");
	System.out.println(longCocktail.getIngredients());	 
	
	tomCocktail.setVolume(62);
	System.out.println(tomCocktail.getVolume());
	

}
}
