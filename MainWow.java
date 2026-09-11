interface Payment {
    void PaymentMethod();
}

class UPIPayment implements Payment {
    public void PaymentMethod() {
        System.out.println("Payment made using UPI");
    }
}

class CreditCardPayment implements Payment {
    public void PaymentMethod() {
        System.out.println("Payment made using Credit Card");
    }
}

public class MainWow {
    public static void main(String[] args) {
        Payment p1 = new UPIPayment();
        p1.PaymentMethod();

        Payment p2 = new CreditCardPayment();
        p2.PaymentMethod();
    }
}
