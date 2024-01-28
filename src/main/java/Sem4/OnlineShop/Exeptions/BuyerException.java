package Sem4.OnlineShop.Exeptions;

public class BuyerException extends Exception {
    public BuyerException(){
    }

    public BuyerException(String message){
        super(message);
    }
}
