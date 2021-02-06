package CreditCardValidation;

public class CreditCardValidation {
    CardValidation validation;

    public boolean isCreditCardValid(String creditCardNumber) {
        return  switch (validation){
            case MASTERCARD -> isMasterCard(creditCardNumber);
            case VISA_CARD -> isVisa(creditCardNumber);
            case DISCOVER_CARD -> isDiscoverCard(creditCardNumber);
            case AMERICAN_EXPRESS -> isAmericanMasterCard(creditCardNumber);
            default -> false;
        };
    }



    public boolean isCreditCardLengthValid(String creditCardNumber) {
        return creditCardNumber.length() >= 13 && creditCardNumber.length() <= 16;
    }

    public boolean isMasterCard(String creditCardNumber) {
        char firstDigit = creditCardNumber.charAt(0);
        int firstIndex = Integer.parseInt(String.valueOf(firstDigit));
        return firstIndex == 5;

    }

    public boolean isVisa(String creditCardNumber) {
        char firstDigit = creditCardNumber.charAt(0);
        int firstIndex = Integer.parseInt(String.valueOf(firstDigit));
        return firstIndex == 4;
    }

    public boolean isDiscoverCard(String creditCardNumber) {
        char firstDigit = creditCardNumber.charAt(0);
        int firstIndex = Integer.parseInt(String.valueOf(firstDigit));
        return firstIndex == 6;
    }

    public boolean isAmericanMasterCard(String creditCardNumber) {
        StringBuilder builder = new StringBuilder();
        char firstDigit = creditCardNumber.charAt(0);
        char secondDigit = creditCardNumber.charAt(1);
        StringBuilder charOfFirstAndSecondIndices = builder.append(firstDigit).append(secondDigit);
        int firstAndSecondIndices = Integer.parseInt(String.valueOf(charOfFirstAndSecondIndices));
        return firstAndSecondIndices == 37;
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