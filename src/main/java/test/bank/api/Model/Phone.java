package test.bank.api.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


/**
 * Класс описывает номера телефонов пользователей
 */
@Entity
@Data
@Table(name = "phones")
public class Phone {

    @Id
    int id;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String nomerPhone;

}
