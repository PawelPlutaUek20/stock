package pl.pluta.stock.productcatalog;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.UUID;

@SpringBootTest
public class JpaPlaygroudTest {
    @Autowired
    ProductRepository productRepository;

    @Test
    void itStoreProduct() {
        UUID id = UUID.randomUUID();
        Product product = new Product(id, "My prod", BigDecimal.ONE, Arrays.asList("k1", "k2"), "mediajpg")
        productRepository.save(product);

        Product loaded = productRepository.finById(id.toStrong()).get();
    }
}
