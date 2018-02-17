package com.illuxplain.services.user;

import com.illuxplain.models.user.User;
import com.illuxplain.repository.user.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServices implements IUserServices, UserDetailsService {

    @Autowired
    private IUserRepository userRepository;

    @Override
    public String getUserName() {
        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user =  userRepository.findByEmail(s);
        return user;
    }
}
