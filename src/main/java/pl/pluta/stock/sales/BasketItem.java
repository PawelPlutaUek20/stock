package pl.pluta.stock.sales;

import java.math.BigDecimal;

public class BasketItem {
    private final String productId;
    private final BigDecimal price;

    public BasketItem(String productId, BigDecimal price) {
        this.productId = productId;
        this.price = price;
    }

    public static BasketItem of(String productId, BigDecimal price) {
        return new BasketItem(productId, price);
    }

    public String getProductId() {
        return productId;
    }

    public int getQuantity() {
        return 1;
    }
}
