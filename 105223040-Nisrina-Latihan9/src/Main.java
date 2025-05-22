class PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Memproses pembayaran sebesar " + amount);
    }

    public void processPayment(double amount, String currency) {
        System.out.println("Memproses pembayaran sebesar " + amount + " " + currency);
    }
}

class CreditCard extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Memproses pembayaran credit card sebesar " + amount);
    }

    @Override
    public void processPayment(double amount, String currency) {
        System.out.println("Memproses pembayaran credit card sebesar " + amount + " " + currency);
    }
}

class EWallet extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Memproses pembayaran e-wallet sebesar " + amount);
    }

    @Override
    public void processPayment(double amount, String currency) {
        System.out.println("Memproses pembayaran e-wallet sebesar " + amount + " " + currency);
    }
}

class BankTransfer extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Memproses pembayaran bank transfer sebesar " + amount);
    }

    @Override
    public void processPayment(double amount, String currency) {
        System.out.println("Memproses pembayaran bank transfer sebesar " + amount + " " + currency);
    }
}

public class Main {
    public static void main(String[] args) {
        PaymentMethod[] payments = {
            new CreditCard(),
            new EWallet(),
            new BankTransfer()
        };

        for (PaymentMethod payment : payments) {
            payment.processPayment(100000);
            payment.processPayment(150000, "IDR");
            System.out.println();
        }
    }
}