package hello.hellospring.service;
 
import hello.hellospring.domain.User;
import hello.hellospring.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * get
     */
    public List<User> findUsers() {
        List<User> test = userRepository.findAll();
        System.out.println(test);
        return test;
    }

    public Long createUser(User user) {
        userRepository.save(user);
        return user.getId();
    }
}
