package com.jkq.jblog.modules.service.impl;

import com.jkq.jblog.modules.repository.UserRepository;
import com.jkq.jblog.modules.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private MessageService messageService;

    @Autowired
    private RoleRepository roleRepository;


}
