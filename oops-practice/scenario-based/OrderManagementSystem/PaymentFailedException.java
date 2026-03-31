package scenario_based.OrderManagementSystem;

class PaymentFailedException extends Exception {
    PaymentFailedException(String message) {
        super(message);
    }
}
