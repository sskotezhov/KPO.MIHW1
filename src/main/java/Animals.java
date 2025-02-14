package main.java;

public class Animals implements IInventory, IAlive{
	protected String name = "Animal";
	protected boolean health = false;
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

