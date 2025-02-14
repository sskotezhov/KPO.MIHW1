package test.java;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import main.java.Animals;
import main.java.Monkey;
import main.java.Rabbit;
import main.java.Wolf;
import main.java.Tiger;


public class AnimalsTest {
	
	@Test
	public void testMonkey()
	{
		Animals monkey = new Monkey(3, 999, 6, true);
		assertEquals("Monkey", monkey.getName());
		assertEquals(3, monkey.getFood());
		assertEquals(999, monkey.getNumber());
		assertEquals(true, monkey.isKind());
		assertEquals(true, monkey.isHealthy());
	}
	@Test
	public void testRabbit()
	{
		Animals rabbit = new Rabbit(3, 999, 4, false);
		assertEquals("Rabbit", rabbit.getName());
		assertEquals(3, rabbit.getFood());
		assertEquals(999, rabbit.getNumber());
		assertEquals(false, rabbit.isKind());
		assertEquals(false, rabbit.isHealthy());
	}
	@Test
	public void testWolf()
	{
		Animals wolf = new Wolf(3, 999, true);
		assertEquals("Wolf", wolf.getName());
		assertEquals(3, wolf.getFood());
		assertEquals(999, wolf.getNumber());
		assertEquals(false, wolf.isKind());
		assertEquals(true, wolf.isHealthy());
	}
	@Test
	public void testTiger()
	{
		Animals tiger = new Tiger(3, 777, false);
		assertEquals("Tiger", tiger.getName());
		assertEquals(3, tiger.getFood());
		assertEquals(777, tiger.getNumber());
		assertEquals(false, tiger.isKind());
		assertEquals(false, tiger.isHealthy());
	}
}
