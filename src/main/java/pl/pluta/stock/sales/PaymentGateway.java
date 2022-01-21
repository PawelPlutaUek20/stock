package pl.pluta.stock.sales;

import java.math.BigDecimal;

public interface PaymentGateway {
    PaymentDetails register(String id, BigDecimal total, CustomerDetails customerDetails);
}
