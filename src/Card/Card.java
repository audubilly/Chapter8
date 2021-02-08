package Card;

import java.util.InputMismatchException;

public class Card {
    private long cardNumber;
    private int cardLength;
    private int firstDigit;

    public void setCardNumber(long cardNumber) {
        checkCardLength(cardNumber);
        if(getCardLength() < 13 || getCardLength() > 16){
            throw new IllegalArgumentException();

        }
        this.cardNumber = cardNumber;

    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void checkCardLength(long cardNumber) {
        cardLength = 0;
        while(cardNumber != 0){
               cardNumber = cardNumber / 10;
               cardLength++;
        }
    }

    public int getCardLength() {
        return cardLength;
    }

    public void checkFirstDigit(long cardNumber){
        checkCardLength(cardNumber);
        firstDigit = (int) (cardNumber / Math.pow(10, getCardLength()-1));
    }

    public int getFirstDigit(){
        return  firstDigit;
    }
}