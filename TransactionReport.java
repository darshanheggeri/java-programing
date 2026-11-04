package reports;

import transaction.Account;

public class TransactionReport {
    public void generateReport(Account acc) {
        System.out.println("\n--- Transaction Report ---");
        System.out.println("Account Number: " + acc.getAccountNumber());
        System.out.println("Balance: " + acc.getBalance());
        System.out.println("--------------------------");
    }
}