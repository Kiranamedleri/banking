package com.onbording.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onbording.Dto.AccountDto;
import com.onbording.Entity.Account;
@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{



	List<AccountDto> findByAccountDtoId(long id);
	

}
