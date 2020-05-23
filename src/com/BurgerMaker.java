package com;

public class BurgerMaker {
	private Burger classic;
	   private Burger cheese;
	   private Burger egg;

	   public BurgerMaker() {
	      classic = new Classic();
	      cheese = new Cheeese();
	      egg = new Egg();
	   }

	   public void makeClassic(){
	      classic.make();
	   }
	   public void makeCheese(){
	      cheese.make();
	   }
	   public void makeEgg(){
	      egg.make();
	   }

}
