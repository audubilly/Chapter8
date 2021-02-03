package CreditCardValidation;

import java.util.Scanner;

public class CreditCardValidation {


//            Scanner scanner = new Scanner(System.in);
//      }      boolean isValid = true;
//            System.out.println("please enter an integer here");
//            String input = scanner.next();
//            for (int i = 0; i < input.length(); i++) {
//                if (!Character.isDigit(input.charAt(i))) ;
//                isValid = false;
//                break;
//            }
//            if (isValid) {
//                System.out.println(Integer.parseInt(input));
//            }


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
}
