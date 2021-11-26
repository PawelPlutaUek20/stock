package pl.pluta.stock.productcatalog;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.beans.Transient;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Entity
public class Product {
    @Id
    private final String id;
    private final String title;
    private final BigDecimal price;
    @Transient
    private final List<String> keywords;
    private final String filePath;

    private Product()();

    public Product(UUID id, String title, BigDecimal price, List<String> keywords, String filePath) {
        this.id = id.toString();
        this.title = title;
        this.price = price;
        this.keywords = keywords;
        this.filePath = filePath;
    }

    public String getId() {
        return  id;
    }
}
