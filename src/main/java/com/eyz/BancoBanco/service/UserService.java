package com.eyz.BancoBanco.service;

import com.eyz.BancoBanco.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
