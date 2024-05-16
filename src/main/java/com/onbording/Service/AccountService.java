package com.onbording.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.onbording.Dto.AccountDto;
import com.onbording.Repository.AccountRepository;

public interface AccountService {
	
	AccountDto createAccount(AccountDto accountDto);

	  List<AccountDto> findById(long id) ;
		
		
	
		
		
	

	
	

}
