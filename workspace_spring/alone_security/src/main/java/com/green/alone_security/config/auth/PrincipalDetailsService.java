package com.green.alone_security.config.auth;

import com.green.alone_security.entity.UserEntity;
import com.green.alone_security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class PrincipalDetailsService implements UserDetailsService {

  @Autowired
  private UserRepository userRepository;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

    UserEntity userEntity = userRepository.findByUserId(username);
    if (userEntity != null) {
      return new PrincipalDetails(userEntity);
    }
    return null;
  }
}
