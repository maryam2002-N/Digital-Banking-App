package ma.enset.digitalbanking_project.repositories;

import ma.enset.digitalbanking_project.entities.BankAccount;
import ma.enset.digitalbanking_project.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
