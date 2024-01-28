package Sem4.OnlineShop;

import Sem4.OnlineShop.Exeptions.AmountException;
import Sem4.OnlineShop.Exeptions.BuyerException;
import Sem4.OnlineShop.Exeptions.ProductException;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws AmountException, BuyerException, ProductException {
        Buyer buyer1 = new Buyer("Иванов Сергей Петрович", Buyer.Gender.man, LocalDate.of(1984, 10, 15), "+79872531230");
        Buyer buyer2 = new Buyer("Петров Роман Евгеньевич", Buyer.Gender.man, LocalDate.of(1990, 1, 30), "+78752304585");

        Buyer[] buyers = {buyer1, buyer2};
        System.out.println(Arrays.toString(buyers));
        Congratulation(buyers, Holidays.noholiday);
        Congratulation(buyers, Holidays.newyear);
        Congratulation(buyers, Holidays.february23);

        Product product1 = new Product("Яблоки", BigDecimal.valueOf(123.13));
        Product product2 = new Product("Груши", BigDecimal.valueOf(150.50));
        Product product3 = new Product("Сыр", BigDecimal.valueOf(500.99));
        Product product4 = new Product("Курица", BigDecimal.valueOf(205.23));
        Product product5 = new Product("Яйца", BigDecimal.valueOf(150.50));

        OnlineShop.getBuyerList().add(buyer1);
        OnlineShop.getBuyerList().add(buyer2);


        OnlineShop.getProductList().add(product1);
        OnlineShop.getProductList().add(product2);
        OnlineShop.getProductList().add(product3);
        OnlineShop.getProductList().add(product4);
        OnlineShop.getProductList().add(product5);


        Order order = OnlineShop.buyProduct("Иванов Сергей Петрович", "Яблоки", 20);
        System.out.println(order);
        System.out.println(OnlineShop.getOrderList().size());

        OnlineShop.getOrderList().add(order);

        Order order1 = OnlineShop.buyProduct("Петров Роман Евгеньевич", "Яйца", 30);
        OnlineShop.getOrderList().add(order1);
        System.out.println(OnlineShop.getOrderList().size());

        Order order2 = OnlineShop.buyProduct("Пирожков", "Яйца", 30);
        OnlineShop.getOrderList().add(order2);
        System.out.println(order);


        System.out.println(OnlineShop.getOrderList().size());


    }

    public enum Holidays {
        noholiday,
        newyear,
        march8th,
        february23
    }

    public static void Congratulation(Buyer[] buyerArr, Holidays holidays) {
        for (Buyer buyer : buyerArr) {
            if (holidays == Holidays.newyear) {
                System.out.println(buyer.getFIO() + " С новым годом!");
            }
            if (holidays == Holidays.february23 && buyer.getGender() == Buyer.Gender.man) {
                System.out.println(buyer.getFIO() + " С 23м февраля!");
            }
            if (holidays == Holidays.march8th && buyer.getGender() == Buyer.Gender.woman) {
                System.out.println(buyer.getFIO() + " С 8м марта!");
            }

        }

    }
}
