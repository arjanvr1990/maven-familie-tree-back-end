//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    @Test
    public void testPersonCreation() {
        Person person = new Person("Jan", "Bakker", 30, "man");
        assertEquals("Jan", person.getName());
        assertEquals("Bakker", person.getLastName());
        assertEquals(30, person.getAge());
        assertEquals("man", person.getSex());
    }

    @Test
    public void testAddChild() {
        Person parent = new Person("Jan", "Bakker", 30, "man");
        Person child = new Person("Piet", "Bakker", 5, "man");
        parent.addChild(child);
        assertEquals(1, parent.getChildren().size());
        assertEquals(child, parent.getChildren().get(0));
    }
}
