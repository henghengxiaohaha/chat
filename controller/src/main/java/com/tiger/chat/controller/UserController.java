package com.tiger.chat.controller;

import com.tiger.chat.infrastructure.repository.dao.UserRepository;
import com.tiger.chat.infrastructure.repository.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    // todo:应用模块间依赖关系待调整
    @RequestMapping("/user")
    public List<UserInfo> findUserByName() {
        return userRepository.findByUserName("test").orElse(List.of());
    }
}
