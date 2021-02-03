package CreditCardValidation;

import java.util.Scanner;

public class CreditCardValidation {

    public boolean isCreditCardValid(String creditCardNumber) {

    }



    public boolean isCreditCardLengthValid(String creditCardNumber) {
        if (creditCardNumber.length() >= 13 && creditCardNumber.length() <= 16) {
            return true;
        }
        return false;
    }

    public boolean isVisa(String creditCardNumber) {
        char firstDigit = creditCardNumber.charAt(0);
        if (firstDigit == '4') {
            return true;
        }
        return false;
    }

    public boolean isMasterCard(String creditCardNumber) {
        char firstDigit = creditCardNumber.charAt(0);
        if (firstDigit == '5') {
            return true;
        }
        return false;

    }

    public boolean isDiscoverCard(String creditCardNumber) {
        char firstDigit = creditCardNumber.charAt(0);
        if (firstDigit == '6') {
            return true;
        }
        return false;
    }

    public boolean isAmericanMasterCard(String creditCardNumber) {
        char firstDigit = creditCardNumber.charAt(0);
        char secondDigit = creditCardNumber.charAt(1);
        if (("" + firstDigit + secondDigit).equals("37")) {
            return true;
        }
        return false;
    }

    public long covertToInteger(String creditCardNumber) {
        long creditCardNumberNew = Long.parseLong(creditCardNumber);
        return creditCardNumberNew;
    }

    public int sumOfEvenNumbers(String creditCardNumber) {
        int creditCardLength = creditCardNumber.length();
        long creditCardNumberNew = covertToInteger(creditCardNumber);

        int sumOfEven = 0;
        for (int counter = 1; counter <= creditCardLength; counter++){
            int digits = (int) (creditCardNumberNew % 10);
            creditCardNumberNew = creditCardNumberNew / 10;
            if( counter %2 == 0){
                digits = digits * 2;
                if (digits >= 10){
                    digits = digits - 9;
                }
                sumOfEven = sumOfEven + digits;
            }

        }
        return sumOfEven;
    }

    public int sumOfOddNumbers(String creditCardNumber) {
        int creditCardLength = creditCardNumber.length();
        long creditCardNumberNew = covertToInteger(creditCardNumber);

        int sumOfOdd = 0;
        for (int counter = 1; counter <= creditCardLength; counter++){
            int digits = (int) (creditCardNumberNew % 10);
            creditCardNumberNew = creditCardNumberNew / 10;
            if( counter %2 == 1){
                sumOfOdd = sumOfOdd + digits;
            }

        }
        return sumOfOdd;
    }


    public int sumOfNumbers(String creditCardNumber) {
        return sumOfEvenNumbers(creditCardNumber) + sumOfOddNumbers(creditCardNumber);
    }


}