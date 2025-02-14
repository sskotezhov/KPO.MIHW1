package test.java;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import main.java.Fabric;
import main.java.Animals;
import java.util.Scanner;

public class FabricTests {
	
	@Test
	public void testBadPatientMonkey()
	{
		Scanner in = new Scanner("4");
		Fabric fabric = new Fabric();
		Animals animal = fabric.create_animal("Monkey", 0, false, in);
		assertEquals(animal.getName(), "Monkey");
		assertEquals(animal.getFood(), 0);
		assertEquals(animal.isHealthy(), false);
		assertEquals(animal.isKind(), false);
		assertEquals(animal.getNumber(), 0);
		in.close();
	}
	@Test
	public void testGoodHealthyRabbit()
	{
		Scanner in = new Scanner("6");
		Fabric fabric = new Fabric();
		fabric.create_animal("Wolf", 0, false, in);
		Animals animal = fabric.create_animal("Rabbit", 10000, true, in);
		assertEquals(animal.getName(), "Rabbit");
		assertEquals(animal.getFood(), 10000);
		assertEquals(animal.isHealthy(), true);
		assertEquals(animal.isKind(), true);
		assertEquals(animal.getNumber(), 1);
		in.close();
	}
	@Test
	public void testGoodPatientTiger()
	{
		Scanner in = new Scanner("6");
		Fabric fabric = new Fabric();
		Animals animal = fabric.create_animal("Tiger", 10000, false, in);
		assertEquals(animal.getName(), "Tiger");
		assertEquals(animal.getFood(), 10000);
		assertEquals(animal.isHealthy(), false);
		assertEquals(animal.isKind(), false);
		assertEquals(animal.getNumber(), 0);
		in.close();
	}
	@Test
	public void BadResponse()
	{
		Scanner in = new Scanner("6");
		Fabric fabric = new Fabric();
		Animals animal = fabric.create_animal("CHECHE", 10000, false, in);
		assertEquals(animal.getName(), "Animal");
		assertEquals(animal.getFood(), -1);
		assertEquals(animal.isHealthy(), false);
		assertEquals(animal.isKind(), false);
		assertEquals(animal.getNumber(), -1);
		in.close();
	}
}
