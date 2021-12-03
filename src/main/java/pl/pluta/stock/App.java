package pl.pluta.stock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.pluta.stock.productcatalog.ProductCatalog;
import pl.pluta.stock.productcatalog.ProductRepository;
import pl.pluta.stock.productcatalog.ProductStorage;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Bean
    public ProductCatalog createProductCatalog(
            ProductRepository productRepository) {
        return new ProductCatalog(productRepository);
    }

}