package test.bank.api.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import test.bank.api.Model.User;

/**
 * хранилище списка пользователей системы
 */
@Repository
public interface UserRepository extends CrudRepository<User,Integer>{

} 
