import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class CardTest {
    @Test
    public void testCard() {
        Card card = new Card(9, "Hearts");
        assertEquals(9, card.getNumber());
    }
    @Test
    public void testSetNumber() {
        Card card = new Card(9,"Hearts");
        card.setNumber(40);
        assertEquals(13, card.getNumber());
    }
    @Test
    public void testRandomCard() {
        Card card = new Card();
        boolean result = false;
        System.out.println(card);
        if(card.getNumber() <= 13 && card.getNumber() > 0) {
            result = true;
        }
        assertTrue(result);
        if(card.getNumber() > 10 || card.getNumber() == 1)
            assertNotNull(card.getName());
    }
}
