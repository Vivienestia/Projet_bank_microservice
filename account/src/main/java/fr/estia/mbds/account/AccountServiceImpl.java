package fr.estia.mbds.account;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;
    private final AccountMapper accountMapper;

    public AccountServiceImpl(AccountRepository accountRepository, AccountMapper accountMapper) {
        this.accountRepository = accountRepository;
        this.accountMapper = accountMapper;
    }

    @Override
    public List<AccountDTO> findAll() {
        return accountRepository.findAll().stream().map(accountMapper::toDTO).collect(Collectors.toList());
    }

    @Override
    public AccountDTO findById(String id) {
        Account account = accountRepository.findById(id).orElse(null);
        if (account != null)
            return accountMapper.toDTO(account);
        return null;
    }

}
