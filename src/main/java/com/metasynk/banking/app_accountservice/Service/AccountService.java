package com.metasynk.banking.app_accountservice.Service;

import com.metasynk.banking.app_accountservice.model.Accounts;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface AccountService {
     List<Accounts> getAllAccounts();

    Accounts getAccountsById(int accountId);

    String saveAccounts(int accountId,String accountType,int userId,double accountBalance);
    void updateAccountBalance(double amount, int accountNumber);
}
