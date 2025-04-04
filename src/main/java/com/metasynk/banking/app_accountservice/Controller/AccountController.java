package com.metasynk.banking.app_accountservice.Controller;

import com.metasynk.banking.app_accountservice.model.Accounts;
import com.metasynk.banking.app_accountservice.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {


    private AccountService accountService;

    @GetMapping("/getAllAccounts")
    public ResponseEntity<List<Accounts>> getAllAccounts(){
        return ResponseEntity.ok(this.accountService.getAllAccounts());

    }

    @GetMapping("/getAccountByAccountId")
    public ResponseEntity<Accounts> getAccoutByUserId(@RequestParam("accountId")int accountId){
        return ResponseEntity.ok(this.accountService.getAccountsById(accountId));
    }

    @PostMapping("/saveAccounts")
    public String saveAccounts(@RequestParam("accountId")int accountId,@RequestParam("accountType")String accountType,@RequestParam("userId")int userId,@RequestParam("accountBalance")double accountBalance){
        return accountService.saveAccounts(accountId,accountType,userId,accountBalance);
    }

    @PostMapping("/updateAccountBalance")
    public ResponseEntity<String> updaeAccountBalance(@RequestParam("amount")double amount, @RequestParam("accountNumber") int accountId){
        return ResponseEntity.ok("Successfully Updated the account balance");
    }
}

