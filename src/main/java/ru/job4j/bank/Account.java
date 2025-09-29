package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс является моделью счета и содержит в себе два поля: реквизиты и баланс,
 * а также геттеры, сеттеры и переопределнные методы equals и hashcode.
 * @author Артур Нагиев
 * @version 1.0
 */
public class Account {
    /**
     * Поле счета "Реквизиты" типа String
     */
    private String requisite;
    /**
     * Поле счета "Баланс" типа double
     */
    private double balance;

    /**
     * Конструктор счета, содержащий два поля
     */

    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Метод-геттер для реквизитов, возвращает значение поля "реквизиты"
     */

    public String getRequisite() {
        return requisite;
    }

    /**
     * Метод-сеттер для реквизитов, устанавливает значение поля "реквизиты"
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Метод-геттер для баланса счета, возвращает значение поля "баланс"
     */
    public double getBalance() {
        return balance;
    }
    /**
     * Метод-сеттер для баланса, устанавливает значение поля "баланс"
     */

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Переопределенный метод equals для сравнения по полю "реквизиты"
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    /**
     * Переопределенный метод hashCode для сравнения по полю "реквизиты"
     */

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
