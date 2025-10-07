//package com.the42duck.the42duckbackend.service;

//import com.the42duck.the42duckbackend.model.User;
//import com.the42duck.the42duckbackend.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//import org.springframework.security.core.userdetails.User.UserBuilder;
//import org.springframework.security.core.userdetails.User as SpringUser;

//@Service
//public class CustomUserDetailsService implements UserDetailsService {

//    @Autowired
//    private UserRepository userRepository;

//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = userRepository.findByUsername(username)
//                        .orElseThrow(() -> new UsernameNotFoundException("Usuário não encontrado: " + username));

//        UserBuilder builder = SpringUser.withUsername(user.getUsername());
//        builder.password(user.getPassword()); // senha já codificada em BCrypt
//        builder.roles("USER"); // você pode personalizar depois

//        return builder.build();
//    }
//}
