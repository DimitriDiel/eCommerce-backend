package org.ecommerce.kafka;

import org.ecommerce.customer.CustomerResponse;
import org.ecommerce.order.PaymentMethod;
import org.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation(
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products
) {
}
