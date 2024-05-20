package test.bank.api.Model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Класс описывает пользователя системы
 */
@Entity
@Data
@Table(name="Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    LocalDate birthday;
    String login;
    String password;

    @OneToMany
    List<Phone> phones;

    @OneToMany
    List<Email> emails;

    Account account;

}
