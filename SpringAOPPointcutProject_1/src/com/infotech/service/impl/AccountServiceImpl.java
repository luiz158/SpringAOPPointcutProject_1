package com.infotech.service.impl;

import org.springframework.stereotype.Service;

import com.infotech.model.Account;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

	/* (non-Javadoc)
	 * @see com.infotech.service.impl.AccountService#updateAccountBalance(com.infotech.model.Account, java.lang.Long)
	 */
	@Override
	public void updateAccountBalance(Account account,Long amount){
		System.out.println("Account No:"+account.getAccountNumber()+", Amount:"+amount);
	}
}
