package main.java;
import java.util.Scanner;

public class App {
	private Zoo zoo = new Zoo();
	private Fabric creator = new Fabric();
	private Clinic clinic = new Clinic(zoo);
	public void start()
	{
		Scanner in = new Scanner(System.in);
		while(true)
		{
			System.out.println("Выберите действие путем ввода его номера: \n1.Добавить животное\n2.Вывести отчет о количестве животных и количестве необходимой еды\n3.Вывести список животных, пригодных для контактного зоопарка\n4.Закончить работу");
			int chosen = in.nextInt();
			switch (chosen)
			{
				case (1):
				{
					System.out.println("Введите тип животного(Monkey/Rabbit/Tiger/Wolf)");
					String name = in.next();
					System.out.println("Введите количество еды");
					int food = in.nextInt();
					System.out.println("Введите здорово ли животное(true/false)");
					boolean healthy = in.nextBoolean();
					clinic.append(creator.create_animal(name, food, healthy, in));
					break;
				}
				case (2):
				{
					System.out.printf("В зоопарке на данный момент %d животных и для них требуется %d киллограммов еды в день\n", zoo.count_animals(), zoo.count_food());
					break;
				}
				case (3):
				{
					Animals tmp;
					for (int i = 0; i < zoo.list_kind_animals().size(); i++)
					{
						tmp = zoo.list_kind_animals().get(i);
						System.out.printf("%s %d %d\n", tmp.getName(), tmp.getNumber(), tmp.getFood());
					}
					break;
				}
				case (4):
				{
					System.out.println("Работа окончена");
					return;
				}
				default:
				{
					in.close();
					System.out.println("Не понял запроса");
					break;
				}
			}
		}
	}
	
}
