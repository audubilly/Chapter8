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
    void testThatCardLengthIsCorrect() {
        String creditCardNumber = "67878997778669";
        boolean isValid = creditCardValidation.isCreditCardLengthValid(creditCardNumber);
        assertTrue(isValid);

    }

    @Test
    void testThatCardIsAVisaCard() {
        String creditCardNumber = "47878997778669";
        boolean isVisa = creditCardValidation.isVisa(creditCardNumber);
        assertTrue(isVisa);
    }

    @Test
    void testThatCardIsMasterCardCreditCard() {
        String creditCardNumber = "57878997778669";
        boolean isMasterCard = creditCardValidation.isMasterCard(creditCardNumber);
        assertTrue(isMasterCard);
    }

    @Test
    void testThatCardIsADiscoverCard() {
        String creditCardNumber = "67878997778669";
        boolean isDiscoverCard = creditCardValidation.isDiscoverCard(creditCardNumber);
        assertTrue(isDiscoverCard);
    }

    @Test
    void testThatCardIsAnAmericanExpressCard() {
        String creditCardNumber = "37878997778669";
        boolean isAmericanMasterCard = creditCardValidation.isAmericanMasterCard(creditCardNumber);
        assertTrue(isAmericanMasterCard);


    }

    @Test
    void testThatCreditCardStringCanBeConvertedToIntegers() {
        String creditCardNumber = "37878997778669";
        long creditCardNumberNew = creditCardValidation.covertToInteger(creditCardNumber);
        assertEquals(37878997778669L, creditCardNumberNew);
    }

    @Test
    void testThatBothOddAndEvenNumbersCanBeSummed() {
        String creditCardNumber = "37878997778669";
        int sumOffEven = creditCardValidation.sumOfEvenNumbers(creditCardNumber);
        assertEquals(44, sumOffEven);
    }

    @Test
    void testThatBothOddAndOddNumbersCanBeSummed() {
        String creditCardNumber = "37878997778669";
        int sumOfOdd = creditCardValidation.sumOfOddNumbers(creditCardNumber);
        assertEquals(52,sumOfOdd);
    }
    @Test
    void testThatSumOfBothOddAndEvenTogether(){
        String creditCardNumber = "37878997778669";
        int total = creditCardValidation.sumOfNumbers(creditCardNumber);
        assertEquals(96,total);
    }

    @Test
    void testThatCreditCardIsValid(){
        String creditCardNumber = "37878997778669";
        boolean isValid = creditCardValidation.isCreditCardValid(creditCardNumber);
        assertTrue(isValid);

    }


}
