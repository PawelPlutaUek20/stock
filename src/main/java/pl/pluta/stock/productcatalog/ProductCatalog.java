package pl.pluta.stock.productcatalog;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public class ProductCatalog {

    private ProductRepository repository;

    public ProductCatalog(ProductRepository repository) {

        this.repository = repository;
    }

    public String addProduct(String title, BigDecimal price, List<String> keywords, String filePath) {
        Product product = new Product(UUID.randomUUID(), title, price, keywords, filePath);
        repository.save(product);
        return product.getId();
    }

    public boolean isProductExists(String productId) {
        return repository.existsById(productId);
    }

    public void publish(String id) {
    }
}
