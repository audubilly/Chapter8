package CreditCardValidation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardValidationTest {

        CreditCardValidation creditCardValidation;
    @BeforeEach
    void setUp() {

        creditCardValidation = new CreditCardValidation();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatCardLengthIsCorrect(){
        String creditCardNumber = "67878997778669";
     boolean isValid = creditCardValidation.isCreditCardLengthValid(creditCardNumber);
        assertTrue(isValid);

    }

    @Test
    void testThatCardIsAVisaCard(){
        String creditCardNumber = "47878997778669";
        boolean isVisa = creditCardValidation.isVisa(creditCardNumber);
        assertTrue(isVisa);
    }

    @Test
    void testThatCardIsMasterCardCreditCard(){
        String creditCardNumber = "57878997778669";
        boolean isMasterCard = creditCardValidation.isMasterCard(creditCardNumber);
        assertTrue(isMasterCard);
    }


    }
