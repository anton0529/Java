package ru.com.anton;

public class CarManager {

	public static void main(String[] args) {

		Car priusCar = new PassengerCar("Toyota Prius", 2008, 1200, 15000, Color.GREEN);

		Car renualtCar = new Bus("Renault Laguna", 1600, 2000, 9700, Color.WHITE);

		Car renualtCar2 = new Bus("Renault Laguna", 1600, 2000, 9700, Color.WHITE);

		priusCar.addDistance(15000);
		priusCar.addDistance(14.3);
		renualtCar.addDistance(15000);

		System.out.println(priusCar);
		System.out.println(renualtCar);

	

		System.out.println(priusCar.IsreadyToService());
		System.out.println(renualtCar.IsreadyToService());
	}
}
