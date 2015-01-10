package org.dirrot.dev.stackoverflow.xstream;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		CarParser carParser = new CarParser();
		List<Car> cars = carParser.parse();
		
		for(Car car : cars) {
			System.out.println(car);
		}
	}

}
