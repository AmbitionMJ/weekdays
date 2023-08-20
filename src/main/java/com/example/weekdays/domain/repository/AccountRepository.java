package com.example.weekdays.domain.repository;

import com.example.weekdays.domain.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public interface AccountRepository extends JpaRepository<Account,Long> {


}
