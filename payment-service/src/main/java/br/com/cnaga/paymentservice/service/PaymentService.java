package br.com.cnaga.paymentservice.service;

import br.com.cnaga.paymentservice.model.Payment;

public interface PaymentService {

	void sendPayment(Payment payment);
}
