package com.user.service;

import org.springframework.data.jpa.repository.JpaRepository;
import com.user.entity.CustomeLoanApply;

public interface CustLoanRepository extends JpaRepository <CustomeLoanApply, Integer>{

	CustomeLoanApply save(CustomeLoanApply user);
	
	Integer updateCustomerLoan(CustomeLoanApply customerLoanApply, Integer id);

}
