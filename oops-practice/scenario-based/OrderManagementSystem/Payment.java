package scenario_based.OrderManagementSystem;

interface Payment {
    void pay(double amount) throws PaymentFailedException;
}
