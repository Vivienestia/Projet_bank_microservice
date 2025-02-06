package fr.estia.mbds.account;

import java.util.List;

public interface AccountService {
    List<AccountDTO> findAll();
    AccountDTO findById(String id);
}
