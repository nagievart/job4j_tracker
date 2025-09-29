package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс является моделью пользователя и содержит в себе два поля: паспорт и имя пользователя,
 * а также конструктор, геттеры, сеттеры и переопределнные методы equals и hashcode.
 * @author Артур Нагиев
 * @version 1.0
 */
public class User {
    /**
     * Поле пользователя "паспорт" типа String
     */
    private String passport;
    /**
     * Поле пользователя "имя пользователя" типа String
     */
    private String username;
    /**
     * Конструктор, содержащий обя поля
     */

    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }
    /**
     * Метод-геттер для паспорта, возвращает значение поля "паспорт"
     */

    public String getPassport() {
        return passport;
    }
    /**
     * Метод-сеттер для паспорта, устанавливает значение поля "паспорт"
     */

    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Метод-геттер для имени пользователя, возвращает значение поля "имя пользователя"
     */

    public String getUsername() {
        return username;
    }
    /**
     * Метод-сеттер для имени пользователя, устанавливает значение поля "имя пользователя"
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Переопределенный метод equals для сравнения по полю "паспорт"
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    /**
     * Переопределенный метод hashCode для сравнения по полю "паспорт"
     */
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
