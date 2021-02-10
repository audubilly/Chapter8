package Card;

public class MasterCard extends Card{
    @Override
    public void setCardNumber(long cardNumber) {
        checkCardLength(cardNumber);
        if(getCardLength() != 16){
            throw new IllegalArgumentException("card number must be equal to 16");
        }
    }

    public long getCardNumber() {
        return super.getCardNumber();
    }
}
