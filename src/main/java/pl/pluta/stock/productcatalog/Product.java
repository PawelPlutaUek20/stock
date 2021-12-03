package pl.pluta.stock.productcatalog;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Entity
public class Product {
    @Id
    private String id;
    private String title;
    private BigDecimal price;
    @Transient
    private List<String> keywords;
    private String filePath;

    Product() {
    }

    public Product(UUID id, String title, BigDecimal price, List<String> keywords, String filePath) {
        this.id = id.toString();
        this.title = title;
        this.price = price;
        this.keywords = keywords;
        this.filePath = filePath;
    }

    public String getId() {
        return id;
    }
}
