package pl.pluta.stock.sales;

import pl.pluta.stock.sales.ordering.CustomerDetails;
import pl.pluta.stock.sales.ordering.PaymentDetails;

import java.math.BigDecimal;

public interface PaymentGateway {
    PaymentDetails register(String id, BigDecimal total, CustomerDetails customerDetails);
}
