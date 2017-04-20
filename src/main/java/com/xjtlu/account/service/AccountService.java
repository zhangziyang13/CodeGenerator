package com.xjtlu.account.service;

import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xjtlu.account.dao.AccountDao;
import com.xjtlu.service.BaseService;

@Service("accountService")
public class AccountService<T> extends BaseService<T> {
	private final static Logger log= Logger.getLogger(AccountService.class);
	

	

	@Autowired
    private AccountDao<T> dao;

		
	public AccountDao<T> getDao() {
		return dao;
	}

}
