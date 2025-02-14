package main.java;

public class Clinic {
	Zoo owned_zoo;
	public Clinic(Zoo _zoo)
	{
		owned_zoo = _zoo;
	}
	public boolean append(Animals _animal)
	{
		if (_animal.isHealthy())
		{
			owned_zoo.add(_animal);
			return true;
		}
		return false;
	}
}
