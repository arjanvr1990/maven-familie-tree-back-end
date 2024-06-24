import org.example.Person;
import org.example.Pet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PetTest {

    @Test
    public void testPetCreation() {
        Pet pet = new Pet("Vlekje", 3, "dog");
        assertEquals("Vlekje", pet.getPetName());
        assertEquals(3, pet.getPetAge());
        assertEquals("dog", pet.getSpecies());
    }
    @Test
    public void testSetNameGetName() {
        Pet pet = new Pet();
        pet.setPetName("Vlekje");
        assertEquals("Vlekje", pet.getPetName());

    }
    @Test
    public void testSetPetAgeGetPetAge() {
        Pet pet = new Pet();
        pet.setPetAge(1);
        assertEquals(1, pet.getPetAge());
    }
    @Test
    public void testSetSpeciesGetSpecies() {
        Pet pet = new Pet();
        pet.setSpecies("dog");
        assertEquals("dog", pet.getSpecies());
    }
//Hoe ik de Owner moest checken lukte niet, hierin liep ik steeds tegen een foutmelding aan///

}
