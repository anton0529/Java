package ru.com.anton;

public class Bus extends Car {

	public Bus(String name, int yearOfProduction, int price, int weight, Color color) {
		super(name, yearOfProduction, price, weight, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean IsreadyToService() {
		if (distanceOnServise > 50000) {
			return true;
		} else {
			return false;
		}
	}

}
