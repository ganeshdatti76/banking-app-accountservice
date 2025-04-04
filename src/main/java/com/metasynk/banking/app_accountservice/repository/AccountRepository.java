package com.metasynk.banking.app_accountservice.repository;

import com.metasynk.banking.app_accountservice.model.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AccountRepository extends JpaRepository<Accounts,Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM Accounts WHERE accountId= ?1")
    Accounts getAccountById(int userId);

    @Query(nativeQuery = true, value = "update Accounts  set accountBalace=?1 WHERE accountId= ?2")
    void updateAccountBalance(double amount,int accountId);
}
