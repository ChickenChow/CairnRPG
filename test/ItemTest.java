package test;

import org.junit.jupiter.api.Test;
import src.Item;

import static org.junit.jupiter.api.Assertions.*;

public class ItemTest {

    @Test
    public void testItemCreation() {
        Item potion = new Item("Potion", 20);
        assertEquals("Item: Potion, Healing Power: 20", potion.getInfo());
    }
}