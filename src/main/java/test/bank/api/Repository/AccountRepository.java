package test.bank.api.Repository;

import org.springframework.data.repository.CrudRepository;

import test.bank.api.Model.Account;

public interface AccountRepository extends CrudRepository<Account, Integer>{

}
