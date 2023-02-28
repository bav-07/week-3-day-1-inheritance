package enclosures;

import animals.Animal;
import animals.Lion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnclosureTest {

    private Enclosure enclosure;

    @BeforeEach
    public void setup(){
        enclosure = new Enclosure("test enclosure");
    }

    @Test
    public void canCountAnimals(){
        int expected = 0;
        int actual = enclosure.countAnimals();
        assertEquals(expected, actual);
    }

    @Test
    public void canAddAnimal(){
        // polymorphism - a single object can take many forms
        Animal animal = new Lion("Simba", false);
        // because it's been declared as an Animal, it cannot use methods that were declared in the Lion class
        enclosure.addAnimal(animal);
        int expected = 1;
        int actual = enclosure.countAnimals();
        assertEquals(expected, actual);
    }

    @Test
    public void canAddMultipleAnimals(){
        Lion lion = new Lion("Simba", false);
        Lion lion2 = new Lion("Kovu", false);
        enclosure.addAnimal(lion);
        enclosure.addAnimal(lion2);
        int expected = 2;
        int actual = enclosure.countAnimals();
        assertEquals(expected, actual);
    }

}
