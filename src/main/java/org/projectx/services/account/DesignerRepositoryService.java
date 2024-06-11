package org.projectx.services.account;

import org.projectx.entity.accounts.DesignerAccount;
import org.projectx.repository.accounts.DesignerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class DesignerRepositoryService {

    @Autowired
    DesignerRepository designerRepository;

    public Set<DesignerAccount> findAll(){
        return (Set<DesignerAccount>)designerRepository.findAll();
    }

    public DesignerAccount findById(Long id){
        Optional<DesignerAccount> optionalDesignerAccount = designerRepository.findById(id);
        return optionalDesignerAccount.get();
    }

    public void save(DesignerAccount account){
        designerRepository.save(account);
    }

}
