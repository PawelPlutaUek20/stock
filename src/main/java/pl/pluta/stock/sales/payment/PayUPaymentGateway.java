package pl.pluta.stock.sales.payment;

import pl.pluta.stock.payment.PayU;
import pl.pluta.stock.payment.RegisterPaymentRequest;
import pl.pluta.stock.payment.RegisterPaymentResponse;
import pl.pluta.stock.sales.PaymentGateway;
import pl.pluta.stock.sales.ordering.CustomerDetails;
import pl.pluta.stock.sales.ordering.PaymentDetails;

import java.math.BigDecimal;
import java.util.Collections;

public class PayUPaymentGateway implements PaymentGateway {
    private final PayU payU;

    public PayUPaymentGateway(PayU payU) {

        this.payU = payU;
    }

    @Override
    public PaymentDetails register(String reservationId, BigDecimal total, CustomerDetails customerDetails) {
        RegisterPaymentResponse response = payU.handle(RegisterPaymentRequest.builder()
                .customerIp("127.0.0.1")
                .description("My Noce service")
                .currencyCode("PLN")
                .totalAmount(getValueAsInteger(total))
                .extOrderId(reservationId)
                .buyer(new RegisterPaymentRequest.Buyer(customerDetails.getEmail(), customerDetails.getFirstname(), customerDetails.getLastname()))
                .products(Collections.singletonList(
                        new RegisterPaymentRequest.Product("My ecommerce service", total.intValue(), 1)
                ))
                .build());

        return new PaymentDetails(reservationId, response.getOrderId(), response.getRedirectUri());
    }

    private int getValueAsInteger(BigDecimal total) {
        return total.multiply(BigDecimal.valueOf(100)).intValue();
    }
}
