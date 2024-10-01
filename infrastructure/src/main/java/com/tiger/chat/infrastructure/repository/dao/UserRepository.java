package com.tiger.chat.infrastructure.repository.dao;

import com.tiger.chat.infrastructure.repository.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<UserInfo, Long>, JpaSpecificationExecutor<UserInfo> {

    Optional<List<UserInfo>> findByUserName(String userName);
}
