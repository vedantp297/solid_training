package com.meditab.training.srp.exercise;

import java.util.Arrays;
import java.util.List;

public class CarManager
{
	private List<car> _carsDb;
	public Car addCar()
	{
		
     _carsDb = Arrays.asList(new Car("1", "Golf III", "Volkswagen"), 
										      new Car("2", "Multipla", "Fiat"),
											  new Car("3", "Megane", "Renault"));
											  
		return _carsDb;
	}
 
}






