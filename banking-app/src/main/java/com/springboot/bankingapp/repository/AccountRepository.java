package com.springboot.bankingapp.repository;

import com.springboot.bankingapp.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
