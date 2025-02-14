package main.java;

public class Rabbit extends Herbo{
	public int Food, Number;
	public Rabbit(int _food, int _number, int _lvlkindness, boolean _health)
	{
		Food = _food;
		Number = _number;
		name = "Rabbit";
		lvlkindness = _lvlkindness;
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
