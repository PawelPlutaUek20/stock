package pl.pluta.stock.productcatalog;

import java.util.HashMap;
import java.util.Optional;

public class ProductStorage {
    HashMap<String, Product> products;

    public ProductStorage() {
        this.products = new HashMap<>();
    }

    public void save(Product product) {
        this.products.put(product.getId(), product);
    }

    public Optional<Product> load(String id) {
        return Optional.ofNullable(products.get(id));
    }
}
