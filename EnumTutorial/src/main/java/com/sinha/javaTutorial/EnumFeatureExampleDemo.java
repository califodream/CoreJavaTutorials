package com.sinha.javaTutorial;

/**
 * This is first full fledge Java Enum example, where member variable, method and constructors are used. 
 * 
 * We know while creating  object constructor will be called.
 * Creating KF object -- no arg constrctor will be called.
 * Creating KF(100) object -- Constrctor with price argument will be called.
 * 
 * Inside Enum, we can not declare abstract method.
 * 
 * @author kishore
 *
 */
public class EnumFeatureExampleDemo {

	enum Beer {
		KF(100), KO(75), RC(90), FO;
		
		int price;
		
		Beer(int price) {
			this.price = price;
		}
		Beer() {
			this.price = 65;
		}
		
		public int getPrice(){
			return price;
		}
	}
	
	public static void main(String[] args) {

		Beer[] beers = Beer.values();
		for (Beer beer : beers) {
			System.out.println(beer+"...."+beer.getPrice());
		}
	}
}
