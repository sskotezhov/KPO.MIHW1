package main.java;

public class Monkey extends Herbo{
	public int Food, Number;
	public Monkey(int _food, int _number, int _lvlkindness, boolean _health)
	{
		Food = _food;
		Number = _number;
		name = "Monkey";
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
