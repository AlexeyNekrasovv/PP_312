package ru.kata.spring.boot_security.demo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import ru.kata.spring.boot_security.demo.entities.User;
import ru.kata.spring.boot_security.demo.repositories.UserRepository;

//    @Component
//    public class UserDetailsServiceImpl implements UserDetailsService {
//        private final UserRepository userRepository;
//
//        public UserDetailsServiceImpl(UserRepository userRepository) {
//            this.userRepository = userRepository;
//        }
//
//        @Override
//        public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//            return userRepository.findByEmail(email).orElseThrow(() ->
//                    new UsernameNotFoundException("User not exist"));
//        }
//}

@Component
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserRepository userDao;

    @Autowired
    public UserDetailsServiceImpl(UserRepository userDao) {
        this.userDao = userDao;

    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userDao.findByEmail(email);
        if (user == null) {
            throw new UsernameNotFoundException(email);
        }
        return user;
    }
}
