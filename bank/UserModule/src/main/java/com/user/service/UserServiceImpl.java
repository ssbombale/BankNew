package com.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.entity.CustomeLoanApply;
import com.user.entity.User;

@Service
public class UserServiceImpl  implements UserService{

	@Autowired
	UserRepository customerRepo;
	
	@Autowired
	CustLoanRepository custLoanRepository;
	
	@Override
	public Integer saveUser(User user) {
		User savedUser = customerRepo.save(user);
		return  savedUser.getId();
	}
	
//	@Override
//	public Integer saveUser(User user) {
//		User savedUser = customerRepo.save(user);
//		return  savedUser.getId();
//	}
//	

	@Override
	public User loadUserByUsername(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer saveLoanApply(CustomeLoanApply user) {
		CustomeLoanApply savedUser = custLoanRepository.save(user);
		return  savedUser.getLoanId();
	}
	
	@Override
	 public Integer updateCustLoan(CustomeLoanApply custLoan, Integer id) {
		CustomeLoanApply existingCust = custLoanRepository.findById(id);
		
		
		
	}
	

}
