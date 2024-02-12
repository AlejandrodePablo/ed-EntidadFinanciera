import com.adpc.features.bankAccount.domain.BankAccount;
import com.adpc.features.bankAccount.presentation.MainBankAccount;
import com.adpc.features.bankingProducts.presentation.MainBankingProduct;
import com.adpc.features.customer.data.CustomerDataRepository;
import com.adpc.features.customer.domain.Customer;
import com.adpc.features.customer.presentation.MainCustomer;
import com.adpc.features.transaction.presentation.MainTransaction;

public class Main {
    public static void main(String[] args) {

        MainTransaction.createTransaction();
        MainCustomer.createCustomer();
        MainCustomer.listCustomer("123456789A");
        MainBankAccount.createBankAccount();
        MainBankingProduct.execute();
    }
}