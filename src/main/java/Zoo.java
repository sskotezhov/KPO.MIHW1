package main.java;

import java.util.ArrayList;

public class Zoo {
	private ArrayList<Animals> collection;
	private int count_food = 0, count_animals = 0;
	public Zoo()
	{
		collection = new ArrayList<>();
	}
	public void add(Animals animal)
	{
		collection.add(animal);
		count_food += animal.getFood();
		count_animals++;
	}
	public int count_food()
	{
		return count_food;
	}
	public int count_animals()
	{
		return count_animals;
	}
	public ArrayList<Animals> list_kind_animals()
	{
		ArrayList<Animals> list = new ArrayList<>();
		for(int i = 0; i < count_animals; i++)
		{
			if (collection.get(i).isKind())
			{
				list.add(collection.get(i));
			}
		}
		return list;
	}
}