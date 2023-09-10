package in.pspk.serviceimpl;


import org.springframework.stereotype.Service;

import in.pspk.entity.User;
import in.pspk.repo.UserRepository;
import in.pspk.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
     
    }

    @Override
    public void registerUser(User user) {
       
        userRepository.save(user);
    }
}
