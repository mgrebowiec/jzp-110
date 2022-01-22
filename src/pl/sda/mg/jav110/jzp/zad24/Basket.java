package pl.sda.mg.jav110.jzp.zad24;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<String> products = new ArrayList<>();
    private int maxElementsCount;

    public Basket(int maxElementsCount) {
        this.maxElementsCount = maxElementsCount;
    }

    public void addToBasket(String product) throws BasketFullException {
        if (products.size() >= maxElementsCount) {
            throw new BasketFullException("Nie ma miejsca w koszyku!");
        }

        products.add(product);
    }

    public void removeFromBasket() {
        if (products.size() < 1) {
            throw new BasketEmptyException("Nie ma produktow w koszyku!");
        }

        products.remove(products.size() - 1);
    }
}
