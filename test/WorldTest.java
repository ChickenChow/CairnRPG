package test;

import org.junit.jupiter.api.Test;
import src.World;

import static org.junit.jupiter.api.Assertions.*;

public class WorldTest {

    @Test
    public void testWorldInitialization() {
        World world = new World();
        assertNotNull(world);
        assertEquals("World: Unknown World, Difficulty: 1", world.getInfo());
    }
}