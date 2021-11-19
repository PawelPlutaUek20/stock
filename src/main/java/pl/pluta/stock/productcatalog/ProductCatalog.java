package pl.pluta.stock.productcatalog;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public class ProductCatalog {

    ProductStorage storage;

    public ProductCatalog() {
        this.storage = new ProductStorage();
    }

    public String addProduct(String title, BigDecimal price, List<String> keywords, String filePath) {
        Product product = new Product(UUID.randomUUID(), title, price, keywords, filePath);
        storage.save(product);
        return product.getId();
    }

    public boolean productExistsWithinTheSystem(String productId) {
        return false;
    }
}
