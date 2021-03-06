package algorithms.searching_sorting.mock;

import algorithms.searching_sorting.model.Car;

public class CarMock {
	
	public Car[] getMockCars() {
		Car[] cars = {
				new Car("Lamborghine", 1000000d),
				new Car("Jipe", 46001d),
				new Car("Brasília", 16000d),
				new Car("Smart", 46000d),
				new Car("Fusca", 17000d),
				new Car("Ferrari", 1230000d),
				new Car("Corsa", 15000d),
		};
		return cars;
	}
	
	public Car[] getMockCarsSorted() {
		Car[] carsOrder = {
				new Car("Corsa", 15000d),
				new Car("Brasília", 16000d),
				new Car("Fusca", 17000d),
				new Car("Smart", 46000d),
				new Car("Jipe", 46001d),
				new Car("Lamborghine", 1000000d),
				new Car("Ferrari", 1230000d),
		};
		return carsOrder;
	}

}
