package org.projectx.repository.accounts;

import org.projectx.entity.accounts.DesignerAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesignerRepository extends JpaRepository<DesignerAccount, Long> {
}
