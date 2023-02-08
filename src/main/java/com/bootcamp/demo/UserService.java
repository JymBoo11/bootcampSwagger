package com.bootcamp.demo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findById(Long id) {
        return userRepository.getReferenceById(id);
    }
    public List<User> findAll() {
        return userRepository.findAll();
    }
    public User save(User user) {
        if (user.getName()==null && user.getBirthDate() == null){
            throw new IllegalArgumentException("Si no pones nada como va a funcionar?????");
        }else if (user.getBirthDate() == null){
            throw new IllegalArgumentException("Introduce la fechaN");
        } else if (user.getName()==null) {
            throw new IllegalArgumentException("Introduce el usuarioo");
        }
        return userRepository.save(user);
    }

    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
