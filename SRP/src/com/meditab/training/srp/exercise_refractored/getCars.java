public class getCars
{
	
    public String getCarsNames(Car _carsDb)
    {
        StringBuilder sb = new StringBuilder();
        for (Car car : _carsDb) 
		{
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }
}
