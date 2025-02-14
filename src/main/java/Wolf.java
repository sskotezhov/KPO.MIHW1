package main.java;

public class Wolf extends Predator{
	public int Food, Number;
	public Wolf(int _food, int _number, boolean _health)
	{
		Food = _food;
		Number = _number;
		name = "Wolf";
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
