package test.java;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import main.java.Clinic;
import main.java.Monkey;
import main.java.Rabbit;
import main.java.Wolf;
import main.java.Tiger;
import main.java.Zoo;

public class ClinicTest {//Clinic and zoo tests...

	@Test
	public void ClinicTest_true()
	{
		Zoo zoo = new Zoo();
		Clinic clinic = new Clinic(zoo);
		clinic.append(new Monkey(3, 1, 2, true));
		assertEquals(zoo.count_animals(), 1);
		clinic.append(new Monkey(1, 2, 9, false));
		assertEquals(zoo.count_animals(), 1);
		clinic.append(new Rabbit(9, 3, 9, true));
		assertEquals(zoo.count_animals(), 2);
		clinic.append(new Rabbit(4, 4, 9, false));
		assertEquals(zoo.count_animals(), 2);
		clinic.append(new Wolf(3, 5, true));
		assertEquals(zoo.count_animals(), 3);
		clinic.append(new Wolf(1, 6, false));
		assertEquals(zoo.count_animals(), 3);
		clinic.append(new Tiger(9, 7, true));
		assertEquals(zoo.count_animals(), 4);
		clinic.append(new Tiger(4, 8, false));
		assertEquals(zoo.count_animals(), 4);
		assertEquals(zoo.count_food(), 24);
		assertEquals(zoo.list_kind_animals().get(0).getFood(), 9);
		assertEquals(zoo.list_kind_animals().get(0).isKind(), true);
		assertEquals(zoo.list_kind_animals().get(0).getNumber(), 3);
		assertEquals(zoo.list_kind_animals().get(0).isHealthy(), true);
		
		
	}
}
