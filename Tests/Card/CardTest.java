package Card;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    Card card;

    @BeforeEach
    void setUp() {
        card = new Card();
    }

    @AfterEach
    void tearDown() {
        card = null;
    }


    @Test
    void testToValidateUserInputs(){
        card.setCardNumber(12345678987654L);
        assertEquals(12345678987654L, card.getCardNumber());
    }

    @Test
     void testThatCardLengthIsValid() {

        Assertions.assertThrows(IllegalArgumentException.class, ()->
        {
            card.setCardNumber(123456717702345678L);
        });
    }

    @Test
    void testThatLengthOfCardCanBeGotten(){
        card.checkCardLength(1234567123456378L);
        assertEquals(16, card.getCardLength());

    }

    @Test
    void testThatTheFirstDigitOfTheCardCanBeGotten(){
        card.checkFirstDigit(562333445566677l);
        assertEquals(5,card.getFirstDigit());


    }

}