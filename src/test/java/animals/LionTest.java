package animals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LionTest {

    private Lion lion;

    @BeforeEach
    public void setUp(){
        lion = new Lion("Scar",false);
    }

    @Test
    public void canMakeNoise(){
        // Arrange
        String expected = "ROAR!";
        // Act
        String actual = lion.makeNoise();
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void canEat(){
        // Arrange
        String expected = "Mmm, that was tasty!";
        // Act
        String actual = lion.eat();
        // Assert
        assertEquals(expected, actual);
    }

}
