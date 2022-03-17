package shop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShoppingCart {

    int id;
    List<Product> products = new ArrayList<>();

    public void sortProduct()
    {
        Collections.sort(products);
    }
}
