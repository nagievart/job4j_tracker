package ru.job4j.bank;

import java.util.*;

/**
 * Класс содержит бизнес-логику банковских сервисов, а именно функцию добавления пользователя,
 * удаления пользователя, добавление счета, поиска пользователя по паспорту, поиска пользователя по реквизитам,
 * отправки и получения денег.
 * @author Артур Нагиев
 * @version 1.0
 */
public class BankService {
    /**
     * Данные о пользователе находятся в Map, ключом является пользователь, а значением-список счетов пользователя
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет пользователя в Map, если такого пользователя еще нет
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }
    /**
     * Метод удаляет пользователя из Map
     */

    public void deleteUser(String passport) {
        users.remove(new User(passport, ""));
    }

    /**
     * Метод ищет пользователя по паспорту и добавлет этому пользователю счет, если такого счета еще нет
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accountsOfUser = users.get(user);
            if (!accountsOfUser.contains(account)) {
                accountsOfUser.add(account);
            }
        }
    }

    /**
     * Метод ищет пользователя по паспорту в Map и если пользователь найден, возвращает пользователя в виде key,
     * а если не находит, то возвращает null
     */
    public User findByPassport(String passport) {
        Set<User> keys = users.keySet();
        for (User key : keys) {
            if (key.getPassport().equals(passport)) {
                return key;
            }
        }
        return null;
    }

    /**
     * Метод ищет пользователя по паспорту в Map и если пользователь найден,
     * метод ищет счет по реквизиту из аргумента метода
     */

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user == null) {
            return null;
        }

        for (Account account : users.get(user)) {
            if (account.getRequisite().equals(requisite)) {
                return account;
            }
        }
        return null;
    }

    /**
     * Метод осуществляет логику отправки денег, осуществляет проверку наличия счетов отправителя и получателя,
     * в случае наличия счетов и отправляемой суммы на счете отправителя, деньги вычитаются из счета отправителя
     * и зачисляются на счет получателя
     */

    public boolean transferMoney(String sourcePassport, String sourceRequisite,
                                 String destinationPassport, String destinationRequisite,
                                 double amount) {
        boolean result = false;
        Account sourceAccount = findByRequisite(sourcePassport, sourceRequisite);
        Account destinationAccount = findByRequisite(destinationPassport, destinationRequisite);
        if (sourceAccount != null && destinationAccount != null & sourceAccount.getBalance() >= amount) {
            destinationAccount.setBalance(destinationAccount.getBalance() + amount);
            sourceAccount.setBalance(sourceAccount.getBalance() - amount);
            result = true;
        }
        return result;
    }

    /**
     * Метод возвращает все счет пользователя
     */
    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}