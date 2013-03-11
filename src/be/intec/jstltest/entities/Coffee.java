package be.intec.jstltest.entities;

import java.io.Serializable;

public class Coffee implements Serializable {
	private String coffeeType;
	private String coffeeBrand;

	public Coffee() {

	}

	public String getCoffeeType() {
		return coffeeType;
	}

	public void setCoffeeType(String coffeeType) {
		this.coffeeType = coffeeType;
	}

	public String getCoffeeBrand() {
		return coffeeBrand;
	}

	public void setCoffeeBrand(String coffeeBrand) {
		this.coffeeBrand = coffeeBrand;
	}

}
