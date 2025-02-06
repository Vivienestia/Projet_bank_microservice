package fr.estia.mbds.account;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data @NoArgsConstructor @AllArgsConstructor
public class AccountDTO {
    private String id;
    private Double balance;
    private LocalDate dateCreated;
    private CurrencyType currencyType;
    private Customer customer;
    private Long customerId;

}
