package test;

import org.junit.jupiter.api.Test;
import src.GameCharacter;

import static org.junit.jupiter.api.Assertions.*;

public class GameCharacterTest {

    @Test
    public void testCharacterCreation() {
        GameCharacter character = new GameCharacter("Maximus", 100.0, 10.0, true);
        assertEquals("Character: Maximus, Health: 100.0, Attack Power: 10.0, Alive: true", character.getInfo());
    }
}
