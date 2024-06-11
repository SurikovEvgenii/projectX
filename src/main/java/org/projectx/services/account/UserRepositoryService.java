package org.projectx.services.account;

import org.projectx.entity.accounts.UserAccount;
import org.projectx.repository.accounts.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserRepositoryService {

    @Autowired
    private UserRepository userRepository;

    public Set<UserAccount> findAll(){
        return (Set<UserAccount>) userRepository.findAll();
    }

    public void save(UserAccount userAccount){
        userRepository.save(userAccount);
    }
}
