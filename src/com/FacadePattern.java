package com;

public class FacadePattern {
	  public static void main(String[] args) {
	      BurgerMaker burgerMaker = new BurgerMaker();

	      burgerMaker.makeClassic();
	      burgerMaker.makeCheese();
	      burgerMaker.makeEgg();		
	   }
}
