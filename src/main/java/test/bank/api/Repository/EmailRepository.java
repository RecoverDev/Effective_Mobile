package test.bank.api.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import test.bank.api.Model.Email;

/**
 * хранилище списка адресов электроной почты пользователей
 */
@Repository
public interface EmailRepository extends CrudRepository<Email, Integer>{
    boolean existByAddressEmail(String address);
}
