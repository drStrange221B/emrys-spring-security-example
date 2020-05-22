package emrys.spring.security.services;

import emrys.spring.security.models.MyUserDetails;
import emrys.spring.security.models.UsersEntity;
import emrys.spring.security.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Supplier;

@Service
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<UsersEntity> user =  userRepository.findByUserName(userName);

         Supplier<RuntimeException> makeFoo = () -> new RuntimeException("User not found");

        return new MyUserDetails(user.orElseThrow( ()-> new UsernameNotFoundException("Not Found: " + userName)));
    }
}
