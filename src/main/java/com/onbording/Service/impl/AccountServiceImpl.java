package com.onbording.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onbording.Dto.AccountDto;
import com.onbording.Entity.Account;
import com.onbording.Mapper.AccountMapper;
import com.onbording.Repository.AccountRepository;
import com.onbording.Service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	private AccountRepository accountRepository;
	
	@Override
	public AccountDto createAccount(AccountDto accountDto) {
		Account account = AccountMapper.mapToAccount(accountDto);
		Account savedAccount= accountRepository.save(account);
		return AccountMapper.mapToAccount(savedAccount);
	}


	@Override
	public List<AccountDto> findById(long id) {
		
		return accountRepository.findByAccountDtoId(id);
	}

}
