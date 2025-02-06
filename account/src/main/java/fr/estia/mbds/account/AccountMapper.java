package fr.estia.mbds.account;

import org.springframework.stereotype.Component;

@Component
public class AccountMapper {
    public AccountDTO toDTO(Account account)
    {
        return new AccountDTO(account.getId(), account.getBalance(), account.getDateCreated(), account.getCurrencyType(), account.getCustomer(), account.getCustomerId());

    }

    public Account toAccount(AccountDTO accountDTO)
    {
        if (accountDTO != null)
            return new Account(null, accountDTO.getBalance(), accountDTO.getDateCreated(), accountDTO.getCurrencyType(), accountDTO.getCustomer(), accountDTO.getCustomerId());
        return null;
    }


}
