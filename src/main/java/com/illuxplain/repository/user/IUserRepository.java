package com.illuxplain.repository.user;

import com.illuxplain.models.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {
    public User findByEmail(String email);
}
