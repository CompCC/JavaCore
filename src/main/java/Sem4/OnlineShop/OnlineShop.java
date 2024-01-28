package Sem4.OnlineShop;

import Sem4.OnlineShop.Exeptions.AmountException;
import Sem4.OnlineShop.Exeptions.BuyerException;
import Sem4.OnlineShop.Exeptions.ProductException;

import java.util.ArrayList;
import java.util.List;

public class OnlineShop {
    private static List<Buyer> buyerList = new ArrayList<>();
    private static List<Product> productList = new ArrayList<>();
    private static List<Order> orderList = new ArrayList<>();

    public static List<Buyer> getBuyerList() {
        return buyerList;
    }

    public static List<Product> getProductList() {
        return productList;
    }

    public static List<Order> getOrderList() {
        return orderList;
    }

    public static Order buyProduct(String buyerFIO, String productName, int quantityOfProducts) throws AmountException, BuyerException, ProductException{
        Buyer passBuyer = null;
        for (Buyer buyer: buyerList ) {
            if(buyer.getFIO().equals(buyerFIO)){
                passBuyer = buyer;
                break;
            }

        }
        Product passProduct = null;
        for (Product product: productList){
            if(product.getName().equals(productName)){
                passProduct = product;
                break;
            }
        }

        if (quantityOfProducts <=0 || quantityOfProducts > 100){
            throw  new AmountException("Неправильное количество продуктов!");
        }
        if (passBuyer == null){
            throw  new BuyerException("Неизвестный покупатель");
        }
        if (passProduct==null){
            throw new ProductException("Неизвестный продукт");
        }

        return new Order(passBuyer,passProduct, quantityOfProducts);
    }


}
