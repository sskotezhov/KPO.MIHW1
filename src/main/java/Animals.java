package main.java;

public class Animals implements IInventory, IAlive{
	public int Food = -1, Number = -1; 
	protected String name = "Animal";
	protected boolean health = false;
	public Animals(){}
	@Override
	public int getNumber()
	{
		return Number;
	}
	@Override
	public int getFood()
	{
		return Food;
	}
	public String getName()
	{
		return name;
	}
	public boolean isKind()
	{
		return false;
	}
	public boolean isHealthy()
	{
		return health;
	}
}

