package com.metasynk.banking.app_accountservice.Service;

import com.metasynk.banking.app_accountservice.model.Accounts;
import com.metasynk.banking.app_accountservice.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountRepository accountRepository;


    @Override
    public List<Accounts> getAllAccounts() {
        return  accountRepository.findAll();
    }

    @Override
    public Accounts getAccountsById(int accountsId) {
        return accountRepository.getAccountById(accountsId);
    }


    public String saveAccounts(int accountId,String accountType,int userId,double accountBalance){
        Accounts account=new Accounts();
        account.setAccountId(accountId);
        account.setAccountType(accountType);
        account.setUserId(userId);
        account.setAccountBalance(accountBalance);
        accountRepository.save(account);

        String response="account saved successfully";
        return response;
    }

    @Override
    public void updateAccountBalance(double amount, int accountNumber) {
        accountRepository.updateAccountBalance(amount,accountNumber);
    }
}
