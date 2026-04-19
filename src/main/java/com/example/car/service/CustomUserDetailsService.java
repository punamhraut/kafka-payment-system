package com.example.car.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) {

        if (username.equals("punam")) {
            return User.builder()
                    .username("punam")
                    .password(new BCryptPasswordEncoder().encode("1234"))
                    .roles("USER")
                    .build();
        }

        throw new UsernameNotFoundException("User not found");
    }
}
