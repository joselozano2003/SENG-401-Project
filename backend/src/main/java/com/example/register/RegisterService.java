package com.example.register;
import com.example.user.LoginUser;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class RegisterService {
    private final RegisterRepository registerRepository;

    public RegisterService(RegisterRepository registerRepository) {
        this.registerRepository = registerRepository;
    }

    public Optional<LoginUser> registerUser(LoginUser user) {
        Optional<LoginUser> userOptional = registerRepository.findUserByEmail(user.getEmail());
        if (userOptional.isEmpty()){
            registerRepository.save(user);
            return Optional.of(user);
        }
        return Optional.empty();
    }
}
