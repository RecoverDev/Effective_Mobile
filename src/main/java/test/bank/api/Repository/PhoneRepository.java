package test.bank.api.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import test.bank.api.Model.Phone;

/**
 * хранилище списка номеров телефонов пользователей системы
 */
@Repository
public interface PhoneRepository extends CrudRepository<Phone, Integer>{
    boolean existByNomerPhone(String nomer);
}
