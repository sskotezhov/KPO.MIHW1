package main.java;

public class Herbo extends Animals{
	public int lvlkindness = 0;
	@Override
	public boolean isKind()
	{
		if (lvlkindness > 5)
		{
			return true;
		}
		return false;
	}
}
