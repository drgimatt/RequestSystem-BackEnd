package com.mapuacsa.requestproj.repository;

import com.mapuacsa.requestproj.model.Account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository <Account, Long> {
}
