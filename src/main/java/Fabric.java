package main.java;
import java.util.Scanner;

public class Fabric {
	private int last = 0;
	Fabric(){};
	public Animals create_animal(String name, int food, boolean health, Scanner in)
	{
		Animals animal = new Monkey(4, 2, 3, true);
		if (name.equalsIgnoreCase("Monkey"))
		{
			System.out.println("Введите уровень доброты по 10-бальной шкале(int)");
			animal = new Monkey(food, last++, in.nextInt(), health);
		}
		else if (name.equalsIgnoreCase("Rabbit"))
		{
			System.out.println("Введите уровень доброты по 10-бальной шкале(int)");
			animal = new Rabbit(food, last++, in.nextInt(), health);
		}
		else if (name.equalsIgnoreCase("Tiger"))
		{
			animal = new Tiger(food, last++, health);
		}
		else if (name.equalsIgnoreCase("Wolf"))
		{
			animal = new Wolf(food, last++, health);
		}
		return animal;
	}
}
