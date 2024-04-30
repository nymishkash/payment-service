package dev.nym.paymentservice.paymentgateways;

import com.razorpay.RazorpayException;

public interface PaymentGateway {
    public String generatePaymentLink(Long orderId, String email) throws RazorpayException;
}
