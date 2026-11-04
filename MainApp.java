import transaction.Account;
import reports.TransactionReport;

public class MainApp {
    public static void main(String[] args) {

        Account acc = new Account(101, 5000);

        System.out.println("Initial Balance: " + acc.getBalance());

        acc.deposit(2000);
        acc.withdraw(1000);

        TransactionReport report = new TransactionReport();
        report.generateReport(acc);
    }
}