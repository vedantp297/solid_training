public class getCarsDetails
{
 public Car getFromDb(final String carId,Car _carsDb)
    {
        for (Car car : _carsDb) 
		{
            if (car.getId().equals(carId)) 
                return car;
            
        }
        return null;
    }
	
}