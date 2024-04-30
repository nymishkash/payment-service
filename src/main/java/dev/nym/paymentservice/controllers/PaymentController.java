package dev.nym.paymentservice.controllers;

import dev.nym.paymentservice.dtos.InitiatePaymentRequestDto;
import dev.nym.paymentservice.services.PaymentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    private PaymentService paymentService;

    PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/")
    public String initiatePayment(@RequestBody InitiatePaymentRequestDto requestDto) {
        return paymentService.initiatePayment(
                requestDto.getOrderId(),
                requestDto.getEmail()
        );
    }
}
