package dev.nym.paymentservice.services;

import com.razorpay.RazorpayException;
import dev.nym.paymentservice.paymentgateways.PaymentGateway;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    private PaymentGateway paymentGateway;

    PaymentService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public String initiatePayment(Long orderId, String email) throws RazorpayException, RazorpayException {
        return paymentGateway.generatePaymentLink(orderId, email);
    }
}
