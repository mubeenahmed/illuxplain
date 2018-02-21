package com.illuxplain.services.user;

import com.illuxplain.dtos.user.UserGetDTO;
import com.illuxplain.models.user.User;
import com.illuxplain.repository.user.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServices implements IUserServices, UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    ModelMapper mapper = new ModelMapper();

    @Override
    public UserGetDTO getUserByEmail(String email) {
        User user = userRepository.findByEmail(email);
        UserGetDTO userGetDTO =  mapper.map(user, UserGetDTO.class);
        return userGetDTO;
    }

    @Override
    public User getFullUserObjectByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user =  userRepository.findByEmail(s);
        return user;
    }
}
