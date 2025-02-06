package fr.estia.mbds.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {

    private final AccountService accountService;
    private final CustomerClient customerClient;

    @Autowired
    public AccountController(AccountService accountService, CustomerClient customerClient) {
        this.accountService = accountService;
        this.customerClient = customerClient;
    }

    @GetMapping("/accounts")
    public List<AccountDTO> getAccounts()
    {
        List<AccountDTO> accounts = accountService.findAll();
        accounts.forEach(account -> {
            account.setCustomer(customerClient.getCustomerById(account.getCustomerId()));
        });
        return accounts;
    }

    @GetMapping("/account/{id}")
    public AccountDTO getAccountById(@PathVariable String id)
    {
        AccountDTO account = accountService.findById(id);
        if (account == null) {
            return null;
        }
        account.setCustomer(customerClient.getCustomerById(account.getCustomerId()));
        return account;
    }
}