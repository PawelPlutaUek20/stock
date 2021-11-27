package pl.pluta.stock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootTest
public class jdbcPlaygroundTest {
    @Autowired
    JdbcTemplate jdbcTemplate;
    void clearDb() {
        jdbcTemplate.execute("DROP TABLE IF EXISTS product_catalog__products");
        jdbcTemplate.execute("CREATE TABLE `product_catalog__products` (" + "`id` varchar(100) NOT NULL," + "`description` varchar(255)," + "PRIMARY KEY (`id`)"+ ");");
    }

    @Test
    void itCountDummyProduct() {
        int productCount = 1;

        assertEquals(1, productCount);
    }

    @Test
    void itCountProduct() {
        int productCount = jdbcTemplate.queryForObject( "select 1", Integer.class);

        assertEquals(1, productCount);
    }

    @Test
    void itCountsRealProducts() {
        clearDb();

        jdbcTemplate.execute(("INSERT INTO `product_catalog__products` (`id`, `description`)" + "VALUES" + "('product1', 'desc 1')," + "('product2', 'desc 2');"));

        int productCount = jdbcTemplate.queryForObject( "select count(*) from `product_catalog__products`", Integer.class);

//        jdbcTemplate.update(insertSql, product.getId(), product.getDescription());

        assertEquals(2, productCount);
    }
}
