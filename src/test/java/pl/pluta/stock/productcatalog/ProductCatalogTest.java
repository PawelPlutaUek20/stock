package pl.pluta.stock.productcatalog;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProductCatalogTest {
    @Test
    void testIdWorks() {
        assertEquals("123", "123");
    }

    @Test
    void itAllowAddProductToCatalog() {
        ProductCatalog catalog = thereIsProductCatalog();

        String productId = catalog.addProduct("Nice Picture", BigDecimal.valueOf(10.10), Arrays.asList("#tag1", "#tag2"), "images/image1.jpeg");

        productExistsWithinTheSystem(catalog, productId);
    }

    private ProductCatalog thereIsProductCatalog() {
        return new ProductCatalog();
    }

    private void productExistsWithinTheSystem(ProductCatalog catalog, String productId) {
        assertTrue(catalog.productExistsWithinTheSystem(productId));
    }
}
