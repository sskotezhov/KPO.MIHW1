package main.java;

public class Tiger extends Predator{
	public int Food, Number;
	public Tiger(int _food, int _number, boolean _health)
	{
		Food = _food;
		Number = _number;
		name = "Tiger";
		health = _health;
	}
	@Override
	public int getFood()
	{
		return Food;
	}
	@Override
	public int getNumber()
	{
		return Number;
	}
	
}
