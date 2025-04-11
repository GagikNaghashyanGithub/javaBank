public class BankingSystem {
    public static void main(String[] args) {

        Bank bank = new Bank();

        bank.addAccount("101", "John Doe", 1000.0);
        bank.addAccount("102", "Jane Smith", 1500.0);

        bank.performTransaction("101", 500.0);
        bank.performTransaction("103", 200.0);

        bank.displayAccountInfo("101");
        bank.displayAccountInfo("102");
    }
}
