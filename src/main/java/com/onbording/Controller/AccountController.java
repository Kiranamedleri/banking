package com.onbording.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onbording.Dto.AccountDto;
import com.onbording.Service.AccountService;
import com.onbording.Service.impl.AccountServiceImpl;

@RestController
@RequestMapping("apiaccounts")
public class AccountController {
	@Autowired
	private AccountServiceImpl accountService;

	/*
	 * public AccountController(AccountService accountService) { this.accountService
	 * = accountService; }
	 */
	
	@PostMapping("/addaccount")
	public ResponseEntity<AccountDto> addAccount(@RequestBody AccountDto accountDto){
		return new ResponseEntity<>(accountService.createAccount(accountDto),HttpStatus.CREATED);
		
	}
	
	@GetMapping("/fetchById/{id}")
	public List<AccountDto> fetchById(@PathVariable long id) {
	 return accountService.findById(id);
		//return new ResponseEntity<AccountDto>(HttpStatus.OK);
	


	}
	
	
	
	
	
	

}
